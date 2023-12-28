import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

import javax.swing.*; 
public class MathFacile1 extends JFrame {
    Font GhostKidAOEPro ;
     MathFacile1() throws FontFormatException, IOException{
        //---------- add font ------------
        try {
  GhostKidAOEPro= Font.createFont(Font.TRUETYPE_FONT, new File("GhostKidAOE_Pro.ttf"));
   GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
   ge.registerFont(GhostKidAOEPro);
}catch (FontFormatException | IOException e) {
 
}

//      Font customFont2 = Font.createFont(Font.TRUETYPE_FONT, new File("SuperBoys-vmW67.ttf"));
//     GraphicsEnvironment ge2 = GraphicsEnvironment.getLocalGraphicsEnvironment();
//     ge2.registerFont(customFont2);


// Font labelFont1 = customFont.deriveFont(); // Plain style, size 16
// Font labelFont2 = customFont.deriveFont(); // Bold style, size 20

        /*------------------   add frame  -----------------*/
    this.setTitle("Baby Bear");
    this.setSize(140, 140);
   this.setLocationRelativeTo(null);// centrer le frame 

/*------------------   add panel  -----------------*/

JPanel panel = new JPanel();


Color yellow = new Color(255, 222, 81);
panel.setBackground(yellow);

   /*-----------------bar qst----------- */
  // image challenge 1 facile 

   ImageIcon imageMATHQSTF = new ImageIcon("math1+2.png"); 

    JLabel qstbar = new JLabel();
    qstbar.setIcon(imageMATHQSTF); 

// les choix 
ImageIcon choix = new ImageIcon("labelchoix.png");

JLabel choix1 = new JLabel();
choix1.setIcon(choix); 
choix1.setText("1"); 
choix1.setHorizontalTextPosition(JLabel.CENTER);
choix1.setFont(GhostKidAOEPro.deriveFont(Font.BOLD,50));

/*----------------partie li ndkhlhom kml fi b3dahum  */
   panel.add(qstbar,choix1);
   this.add(panel);
      

 

/*----------------------must do it-----------------  */
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setVisible(true);
    }
    public static void main(String[] args) throws Exception {
        new MathFacile1();
    }
}
