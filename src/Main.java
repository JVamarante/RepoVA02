public class Main {
    public static void main(String[] args) {
        DatabaseConnection conn1 = DatabaseConnection.getInstance();
        DatabaseConnection conn2 = DatabaseConnection.getInstance();
        DatabaseConnection conn3 = DatabaseConnection.getInstance();

        System.out.println("conn1 == conn2: " + (conn1 == conn2));
        System.out.println("conn2 == conn3: " + (conn2 == conn3));

        conn1.connect();
        conn2.connect();
        conn3.connect();
    }
}
