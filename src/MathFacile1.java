import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class MathFacile1 extends JFrame {
    Font ghostKidAOEPro ;
// une methode construit les 4 buttons du reponses 
    public JButton createTransparentButton(String text, String imagePath) {
      JButton button = new JButton();

      ImageIcon icon = new ImageIcon(imagePath);
      button.setIcon(icon);
      button.setText(text);
      button.setHorizontalTextPosition(JLabel.CENTER);
      button.setFont(ghostKidAOEPro.deriveFont(Font.BOLD, 50));

      // Remove borders and set transparent background
      button.setBorderPainted(false);
      button.setOpaque(false);
      button.setFocusPainted(false);
      button.setBackground(new Color(255, 0, 0, 128));

      return button;
  }


     MathFacile1() throws FontFormatException, IOException{
        //---------- add font ------------
        try {
  ghostKidAOEPro= Font.createFont(Font.TRUETYPE_FONT, new File("GhostKidAOE_Pro.ttf"));
   GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
   ge.registerFont(ghostKidAOEPro);
}catch (FontFormatException | IOException e) {
 
}


        /*------------------   add frame  -----------------*/
    this.setTitle("Baby Bear");
    this.setSize(500, 500);
    
JLabel background = new JLabel(new ImageIcon("BGQST.png")); 

/*------------------   add panel 1  -----------------*/

JPanel panel = new JPanel();



   /*-----------------bar qst----------- */
  // image challenge 1 facile 

   ImageIcon imageMATHQSTF = new ImageIcon("math1+2.png"); 

    JLabel qstbar = new JLabel();
    qstbar.setIcon(imageMATHQSTF); 

// les choix 

JButton choix1 = createTransparentButton("1", "labelchoix.png");
JButton choix2 = createTransparentButton("2", "labelchoix.png");
JButton choix3 = createTransparentButton("10", "labelchoix.png");
JButton choix4 = createTransparentButton("20", "labelchoix.png");
//



/*----------------partie li ndkhlhom kml fi b3dahum  */
panel.add(choix1); 
panel.add(choix2);
panel.add(choix3);
panel.add(choix4);
panel.add(qstbar);
this.add(background);
  this.add(panel);
  this.setLocationRelativeTo(null);// centrer le frame
      

 

/*----------------------must do it-----------------  */
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setVisible(true);
    }

    public static void main(String[] args) throws Exception {
        new MathFacile1();
    }
}
