package Components;



import com.toedter.calendar.JDateChooser;
import java.math.BigInteger;
import java.security.MessageDigest;
import javax.swing.ButtonGroup;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Compoments {

    public String encryptPassword(String password) {
        
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] messageDigest = md.digest(password.getBytes());
            BigInteger no = new BigInteger(1, messageDigest);
            String hashtext = no.toString(16);
            while (hashtext.length() < 32) {
                hashtext = "0" + hashtext;
            }
            return hashtext;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        
    }

    public void clear(JTextField firstName, JTextField lastName, JTextField username, JPasswordField password, ButtonGroup gender, JDateChooser dob) {
        
        firstName.setText("");
        lastName.setText("");
        gender.clearSelection();
        dob.setDate(null);
        username.setText("");
        password.setText("");
        
    }

    public void clear(JTextField username, JPasswordField password) {
        
        username.setText("");
        password.setText("");
        
    }

}
