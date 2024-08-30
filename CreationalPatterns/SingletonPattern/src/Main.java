public class Main {
    public static void main(String[] args) {

        DatabaseConnection connection1 = DatabaseConnection.getInstance();
        connection1.connect();

        DatabaseConnection connection2 = DatabaseConnection.getInstance();
        connection2.disconnect();

        System.out.println("Are both connections the same instance? " + (connection1 == connection2));

    }
}