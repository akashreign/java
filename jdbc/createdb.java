import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class createdb {
    public static void main(String[] args) {
        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/Ak"; // Include database name in URL
            String username = "root";
            String password = "Ananyadg@69";

            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");

            // Perform database operations here
            // ...

        } catch (SQLException e) {
            System.err.println("Error connecting to the database: " + e.getMessage());
        } finally {
            // Close the connection in the finally block
            try {
                if (conn != null) {
                    conn.close();
                    System.out.println("Connection closed.");
                }
            } catch (SQLException e) {
                System.err.println("Error closing connection: " + e.getMessage());
            }
        }
    }
}
