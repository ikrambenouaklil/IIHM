import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
public class Sld1 extends JFrame{ 
    //--- constructeur -------
    Font GhostKidAOEPro ;
  Sld1 ()  throws FontFormatException, IOException{
    /*------------add font ----------- */
   
        try {
  GhostKidAOEPro= Font.createFont(Font.TRUETYPE_FONT, new File("GhostKidAOE_Pro.ttf"));
   GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
   ge.registerFont(GhostKidAOEPro);
}catch (FontFormatException | IOException e) {
 
}
        ImageIcon text;
   JLabel lab;
   ImageIcon play;
     JButton b1;
/* -------frame --------------- */
        this.setTitle("Main Slide");
        this.setSize(550, 650);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

  /* -------label --------------- */
   text = new ImageIcon();

   lab =new JLabel(text);

   lab.setBounds(200,0,950,350);
   this.add(lab);
   this.pack();
   play=new ImageIcon("play.png");
   b1=new JButton(play);
   b1.setBounds(470,450,290,110);
   this.add(b1);
   this.setVisible(true);


   }

   
      public static  void main(String[] args) throws FontFormatException, IOException {
   new Sld1 ();

      }

     }

   
    



    
