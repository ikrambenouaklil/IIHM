
import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.jar.JarFile;

public class CreateButt{
    static Font ghostKidAOEPro ; 
    public  static JButton ButtonIcons( String imagePath) {
        // une methode construit les 4 buttons du reponses 
        
        JButton button = new JButton();
  
        ImageIcon icon = new ImageIcon(imagePath);
        button.setIcon(icon);
        // Remove borders and set transparent background
        button.setBorderPainted(false);
        button.setOpaque(false);
        button.setFocusPainted(false);
        button.setBackground(new Color(255, 0, 0, 128));
  
        return button;}
    

          public  static JButton createTransparentButton(String text, String imagePath) {
        JButton button = new JButton();
     try {
         ghostKidAOEPro= Font.createFont(Font.TRUETYPE_FONT, new File("GhostKidAOE_Pro.ttf"));
         GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
         ge.registerFont(ghostKidAOEPro);
       }catch (FontFormatException | IOException e) {
       }
         
        ImageIcon icon = new ImageIcon(imagePath);
        button.setIcon(icon);
        button.setText(text);
        button.setForeground(new Color(0X7E5001));
        button.setHorizontalTextPosition(JLabel.CENTER);
        button.setFont(ghostKidAOEPro.deriveFont(Font.BOLD, 50));
    
        // Remove borders and set transparent background
        button.setBorderPainted(false);
        button.setOpaque(false);
        button.setFocusPainted(false);
        button.setBackground(new Color(255, 0, 0, 128));
    
        return button;
    }

}
