package hw2.Task3;

public class DefaultConnectionManager implements ConnectionManager {
    @Override
    public Connection getConnection() {
        return new StableConnection();
    }
}
