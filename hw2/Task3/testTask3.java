import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class ConnectionTest {
    private Connection stableConnection;
    private Connection faultyConnection;

    @BeforeEach
    public void setUp() {
        stableConnection = new StableConnection();
        faultyConnection = new FaultyConnection();
    }

    @Test
    public void testStableConnection() {
        // Проверка, что стабильное соединение выполняет команду без исключений
        assertThatCode(() -> stableConnection.execute("test command"))
                .doesNotThrowAnyException();
    }

    @Test
    public void testFaultyConnection() {
        // Проверка, что проблемное соединение может бросить ConnectionException
        assertThatThrownBy(() -> faultyConnection.execute("test command"))
                .isInstanceOf(ConnectionException.class);
    }

    @Test
    public void testDefaultConnectionManager() {
        // Проверка, что DefaultConnectionManager всегда возвращает стабильное соединение
        DefaultConnectionManager manager = new DefaultConnectionManager();
        Connection connection = manager.getConnection();
        assertThat(connection).isInstanceOf(StableConnection.class);
    }

    @Test
    public void testFaultyConnectionManager() {
        // Проверка, что FaultyConnectionManager всегда возвращает проблемное соединение
        FaultyConnectionManager manager = new FaultyConnectionManager();
        Connection connection = manager.getConnection();
        assertThat(connection).isInstanceOf(FaultyConnection.class);
    }
}
