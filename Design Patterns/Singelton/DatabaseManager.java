import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseManager {
    private static DatabaseManager dbManager;
    private Connection connection;

    private DatabaseManager() throws SQLException {
        connection = DriverManager.getConnection("jdbc:mysql://localhost:3306","user","password");
    }

    public static DatabaseManager getInstance() throws SQLException {
        if (dbManager == null) {
            dbManager = new DatabaseManager();
        }
        return dbManager;
    }

    public Connection getConnection() {
        return connection;
    }

}
