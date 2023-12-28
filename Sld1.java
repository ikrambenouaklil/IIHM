import javax.swing.*;
import java.awt.*;

public class Sld1 { 
      public static void main(String[] args) {
   JFrame F;

   ImageIcon text;
 
   
   JLabel lab;
   ImageIcon play;
     JButton b1;

        F=new JFrame ();
        F.setTitle("Main Slide");
        F.setSize(550, 650);
        F.setLayout(null);
        F.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        

  
   text = new ImageIcon("txt.png");
   lab=new JLabel(text);

   lab.setBounds(200,0,950,350);
   F.add(lab);
   F.pack();
   play=new ImageIcon("play.png");
   b1=new JButton(play);
   b1.setBounds(470,450,290,110);
   F.add(b1);
   F.setVisible(true);


   }


    
   }




    
