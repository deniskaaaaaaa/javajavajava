package hw2.Task3;
public class Main {
    public static void main(String[] args) {
        ConnectionManager manager = new DefaultConnectionManager();
        PopularCommandExecutor executor = new PopularCommandExecutor(manager, 3);
        executor.updatePackages();
    }
}
