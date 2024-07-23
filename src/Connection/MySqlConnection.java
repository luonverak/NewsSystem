package Connection;



import java.sql.DriverManager;
import java.sql.Connection;

public class DbConnection {

    public Connection connection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "luonverak");
        } catch (Exception e) {
            System.err.println(e);
        }
        return con;
    }

}
