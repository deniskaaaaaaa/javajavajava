package hw2.Task3;
public final class PopularCommandExecutor {
    private final ConnectionManager manager;
    private final int maxAttempts;

    public PopularCommandExecutor(ConnectionManager manager, int maxAttempts) {
        this.manager = manager;
        this.maxAttempts = maxAttempts;
    }

    public void updatePackages() {
        tryExecute("apt update && apt upgrade -y");
    }

    void tryExecute(String command) {
        for (int attempt = 1; attempt <= maxAttempts; attempt++) {
            try (Connection connection = manager.getConnection()) {
                connection.execute(command);
                return;
            } catch (ConnectionException e) {
                if (attempt == maxAttempts) {
                    throw new ConnectionException("Failed to execute command: " + command, e);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    }
