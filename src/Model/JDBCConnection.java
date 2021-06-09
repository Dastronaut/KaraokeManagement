package Model;
/**
 *
 * @author Trần Kim Tiến Đạt
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnection {
    public static Connection getJDBCConnection() {
        final String url = "jdbc:mysql://localhost:3306/karaokemanagement";
        final String user = "root";
        final String password = "6996";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException e) {
        }
        return null;
    }
}
