package Model;

import java.util.ArrayList;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor 

public class UserModel {

    private int id;
    private String firstName;
    private String lastName;
    private String gender;
    private String dob;
    private String username;
    private String password;
    private String email;
    private String phone;
    private String position;
    private float salary;
    private String role;
    private String profile;

    public UserModel(int id, String firstName, String lastName, String gender, String dob, String username, String password, String email, String phone, String position, float salary, String role, String profile) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.position = position;
        this.salary = salary;
        this.role = role;
        this.profile = profile;
    }

    public UserModel(String firstName, String lastName, String gender, String dob, String username, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.dob = dob;
        this.username = username;
        this.password = password;
    }

    public UserModel(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "UserModel{" + "id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + ", dob=" + dob + ", username=" + username + ", password=" + password + ", email=" + email + ", phone=" + phone + ", position=" + position + ", salary=" + salary + ", role=" + role + ", profile=" + profile + '}';
    }
    
   public static List<Integer> listId = new ArrayList<>();

}
