package hw2.Task3;

public interface Connection extends AutoCloseable {
    void execute(String command);
}
