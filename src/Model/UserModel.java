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

    private String firstName;
    private String lastName;
    private String gender;
    private String dob;
    private String username;
    private String password;

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

   public static List<Integer> listId = new ArrayList<>();

}
