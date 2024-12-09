public class DatabaseConnection {
    private static DatabaseConnection instance;

    private DatabaseConnection() {
        System.out.println("Conexão criada. ID da instância: " + this.hashCode());
    }

    public static synchronized DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance;
    }

    public void connect() {
        System.out.println("Conexão estabelecida. ID da conexão: " + this.hashCode());
    }
}
