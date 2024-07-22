package Controller;

import Components.Compoments;
import Connection.DbConnection;
import Model.UserModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class UserController {

    private Compoments compoments = new Compoments();
    private DbConnection con = new DbConnection();
    private PreparedStatement ps;
    private ResultSet rs;
    public List<String> listUsername = new ArrayList<>();

    public UserController() {
    }

    public void getUsername() {
        String sqlScript = "SELECT username FROM user";
        try {
            ps = con.connection().prepareStatement(sqlScript);
            rs = ps.executeQuery();
            while (rs.next()) {
                listUsername.add(rs.getString("username"));
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    public boolean createAccount(UserModel userModel) {

        String sqlScript = "INSERT INTO user (first_name,last_name,gender,dob,username,password) VALUES(?,?,?,?,?,?)";
        try {
            ps = con.connection().prepareStatement(sqlScript);

            ps.setString(1, userModel.getFirstName());
            ps.setString(2, userModel.getLastName());
            ps.setString(3, userModel.getGender());
            ps.setString(4, userModel.getDob());
            ps.setString(5, userModel.getUsername());
            ps.setString(6, this.compoments.encryptPassword(userModel.getPassword()));

            if (ps.executeUpdate() > 0) {
                getUsername();
                return true;
            }
            
        } catch (Exception e) {
            System.err.println(e);
        }
        return false;
    }

    public boolean loginAccount(UserModel userModel) {

        String sqlScript = "SELECT id FROM user WHERE (username=? AND password=?);";
        try {
            ps = con.connection().prepareStatement(sqlScript);

            ps.setString(1, userModel.getUsername());
            ps.setString(2, this.compoments.encryptPassword(userModel.getPassword()));

            rs = ps.executeQuery();

            if (rs.next()) {
                UserModel.listId.clear();
                UserModel.listId.add(rs.getInt("id"));
                return true;
            }
            
        } catch (Exception e) {
            System.err.println(e);
        }
        return false;
    }
}
