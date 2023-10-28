package hw2.Task3;
import java.util.Random;

public class StableConnection implements Connection {
    @Override
    public void execute(String command) {
        System.out.println("Executing command: " + command);
    }
    @Override
    public void close() {
    }
}
