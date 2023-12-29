import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
public class Sld1 extends JFrame{ 
    //--- constructeur -------
    Font GhostKidAOEPro ;
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
   play=new ImageIcon("play.png");
     b1=new JButton(play);
     b1.setBounds(470,450,290,110);
     /*delete border*/ 
b1.setBorderPainted(false); // Remove default border
b1.setOpaque(false);      // Make background transparent
b1.setFocusPainted(false); // Remove focus border (optional)
button.setHorizontalTextPosition(JButton.CENTER);
button.setVerticalTextPosition(JButton.CENTER);
button.setForeground(new Color(255, 255, 255, 150)); // Semi-transparent text
     panel.add(b1);
  
this.add(panel);

     /* we must do it  */
     this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     this.setVisible(true);
     


   }

   
      public static  void main(String[] args) throws FontFormatException, IOException {
   new Sld1 ();

      }

     }

   
    



    
