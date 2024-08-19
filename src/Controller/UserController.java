package Controller;

import Components.Compoments;
import Connection.MySqlConnection;
import Model.UserModel;
import java.util.ArrayList;
import java.util.List;

public class UserController {

    private Compoments compoments = new Compoments();
    private MySqlConnection connection = new MySqlConnection();
    public List<String> listUsername = new ArrayList<>();
    public List<UserModel> listUser = new ArrayList<>();

    public void getUsername() {
        String sqlScript = "SELECT username FROM user";
        try {
            connection.ps = connection.connection().prepareStatement(sqlScript);
            connection.rs = connection.ps.executeQuery();
            while (connection.rs.next()) {
                listUsername.add(connection.rs.getString("username"));
            }
        } catch (Exception ex) {
            System.err.println(ex);
        }
    }

    public boolean createAccount(UserModel userModel) {

        String sqlScript = "INSERT INTO user (first_name,last_name,gender,dob,username,password) VALUES(?,?,?,?,?,?)";
        try {
            connection.ps = connection.connection().prepareStatement(sqlScript);
            connection.ps.setString(1, userModel.getFirstName());
            connection.ps.setString(2, userModel.getLastName());
            connection.ps.setString(3, userModel.getGender());
            connection.ps.setString(4, userModel.getDob());
            connection.ps.setString(5, userModel.getUsername());
            connection.ps.setString(6, this.compoments.encryptPassword(userModel.getPassword()));

            if (connection.ps.executeUpdate() > 0) {
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
            connection.ps = connection.connection().prepareStatement(sqlScript);
            connection.ps.setString(1, userModel.getUsername());
            connection.ps.setString(2, userModel.getPassword());
            connection.rs = connection.ps.executeQuery();
            if (connection.rs.next()) {
                UserModel.listId.clear();
                UserModel.listId.add(connection.rs.getInt("id"));
                return true;
            }

        } catch (Exception e) {
            System.err.println(e);
        }
        return false;
    }

    public void getUser(int userId) {
        try {
            String sqlScript = "SELECT * FROM user WHERE id=" + userId + "";
            connection.ps = connection.connection().prepareStatement(sqlScript);
            connection.rs = connection.ps.executeQuery();
            while (connection.rs.next()) {

                listUser.add(new UserModel(
                        connection.rs.getInt("id"),
                        connection.rs.getString("first_name"),
                        connection.rs.getString("last_name"),
                        connection.rs.getString("gender"),
                        connection.rs.getString("dob"),
                        connection.rs.getString("username"),
                        connection.rs.getString("password"),
                        connection.rs.getString("email"),
                        connection.rs.getString("phone_number"),
                        connection.rs.getFloat("salary"),
                        connection.rs.getString("role"),
                        connection.rs.getString("profile"))
                );
            }
        } catch (Exception e) {
        }
    }

    public boolean addStaff(UserModel userModel) {
        String sqlScript = "INSERT INTO user (first_name,last_name,gender,dob,username,password,email,phone_number,salary,role,profile) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
        try {
            connection.ps = connection.connection().prepareStatement(sqlScript);
            connection.ps.setString(1, userModel.getFirstName());
            connection.ps.setString(2, userModel.getLastName());
            connection.ps.setString(3, userModel.getGender());
            connection.ps.setString(4, userModel.getDob());
            connection.ps.setString(5, userModel.getUsername());
            connection.ps.setString(6, userModel.getPassword());
            connection.ps.setString(7, userModel.getEmail());
            connection.ps.setString(8, userModel.getPhone());
            connection.ps.setDouble(9, userModel.getSalary());
            connection.ps.setString(10, userModel.getRole());
            connection.ps.setString(11, userModel.getProfile());

            if (connection.ps.executeUpdate() > 0) {
                getUsername();
                return true;
            }

        } catch (Exception e) {
            System.err.println(e);
        }
        return false;
    }

}
