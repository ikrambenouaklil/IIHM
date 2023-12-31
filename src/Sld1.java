import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;

public class Sld1 extends JFrame{ 

    Font ghostKidAOEPro ;
   
   
     //--- constructeur -------
  Sld1 ()  throws FontFormatException, IOException{


//declaration 
        ImageIcon text;
   JLabel lab;
   ImageIcon play;
     JButton b1;
/* -------frame --------------- */
        this.setTitle("Baby Bear");
        this.setSize(550, 650);
        ImageIcon icon = new ImageIcon("BabyBearIcon.png");
        this.setIconImage(icon.getImage());
       
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
JButton Play= Create .createTransparentButton("Play", "play.png", 50);
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

   
    



    
