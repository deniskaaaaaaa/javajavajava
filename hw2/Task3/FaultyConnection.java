package hw2.Task3;
import java.util.Random;
public class FaultyConnection implements Connection {
    private final Random random = new Random();

    @Override
    public void execute(String command) {
        if (random.nextBoolean()) {
            throw new ConnectionException();
        }
        System.out.println("Executing command: " + command);
    }

    @Override
    public void close() {
        // Закрыть соединение
    }
}
