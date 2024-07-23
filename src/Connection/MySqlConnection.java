package Connection;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MySqlConnection {

    public PreparedStatement ps;
    public ResultSet rs;

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
