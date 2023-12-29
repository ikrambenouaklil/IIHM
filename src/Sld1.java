import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
public class Sld1 extends JFrame{ 


    //--- constructeur -------
    Font ghostKidAOEPro ;
    // method to add a button
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
  Sld1 ()  throws FontFormatException, IOException{
    /*------------add font ----------- */
   
//         try {
//   GhostKidAOEPro= Font.createFont(Font.TRUETYPE_FONT, new File("GhostKidAOE_Pro.ttf"));
//    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
//    ge.registerFont(GhostKidAOEPro);
// }catch (FontFormatException | IOException e) {
 
// }

//declaration 
        ImageIcon text;
   JLabel lab;
   ImageIcon play;
     JButton b1;
/* -------frame --------------- */
        this.setTitle("Main Slide");
        this.setSize(550, 650);
        
       
        /*-------panel ------- */
        JPanel panel = new  JPanel ();
        Color yellow = new Color(255, 222, 81) ;
panel.setBackground(yellow);
    /* -------label --------------- */

   text = new ImageIcon("text.png");//text 
   lab =new JLabel(text);//text => label
   lab.setBounds(200,0,950,350);
   panel.add(lab);
  //  panel.pack();
   
   /* play button */
   JButton Play= createTransparentButton("Play", "play.png");
panel.add(Play); 
this.add(panel);

     /* we must do it  */
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setVisible(true);
     


   }

   
      public static  void main(String[] args) throws FontFormatException, IOException {
   new Sld1 ();

      }

     }

   
    



    
