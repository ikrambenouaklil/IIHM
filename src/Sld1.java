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
JButton Play= CreateButt.createTransparentButton("Play", "play.png");
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

   
    



    
