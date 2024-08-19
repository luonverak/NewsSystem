package Components;

import java.awt.Image;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;

public class ChooseFile {

    private String fileName;

    public String chooseFile(JLabel profile) {
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        fileName = f.getAbsolutePath();
        ImageIcon icon = new ImageIcon(fileName);
        profile.setIcon(icon);
        int desiredWidth = 300;
        int desiredHeight = 200;
        ImageIcon imageIcon = new ImageIcon(fileName);
        Image originalImage = imageIcon.getImage();
        Image scaledImage = originalImage.getScaledInstance(desiredWidth, desiredHeight, Image.SCALE_REPLICATE);
        ImageIcon scaledIcon = new ImageIcon(scaledImage);
        profile.setIcon(scaledIcon);
        return fileName;
        
    }
}
