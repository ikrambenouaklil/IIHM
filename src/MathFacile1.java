import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.jar.JarFile;

public class MathFacile1 extends JFrame {
    Font ghostKidAOEPro ;


    

  


    MathFacile1() throws FontFormatException, IOException{


    
  /*------------------   add frame  -----------------*/
      
        setTitle("Baby Bear");
        setSize(500, 500);
        setLayout(new BorderLayout());
        /* add background  */
        
        JLabel background=new JLabel(new ImageIcon("qst bg.png"));
        add(background);
        background.setLayout(new BorderLayout());
        
        /*------------------   add panels  -----------------*/
   
        JPanel panel = new JPanel();// cote 
        
        JPanel panel1 = new JPanel();//li fl wst 
       
        JPanel panel2 = new JPanel();// south 
 
        panel.setBackground(Color.red);
        panel1.setBackground(Color.blue);
        panel2.setBackground(Color.yellow);
//panel 1 n9smo 
        panel1.setLayout(new BorderLayout());

        // panel.setPreferredSize(new Dimension(100,100));//EAST
        // panel1.setPreferredSize(new Dimension(100,100));//CENTER
        // panel2.setPreferredSize(new Dimension(100,100));//SOUTH
   

             
       /*-----------------bar qst----------- */
        JPanel qstpanel = new JPanel(); 
        ImageIcon imageMATHQSTF = new ImageIcon("math1+2.png"); 
        JLabel qstbar = new JLabel();
        qstbar.setIcon(imageMATHQSTF);
        qstbar.setHorizontalAlignment(JLabel.CENTER);
        qstbar.setVerticalAlignment(JLabel.CENTER);
 
        // les choix
        JPanel southChoix = new JPanel();  
        southChoix.setLayout(new BorderLayout());
        //------------row 1 ------------
        JPanel Vertical1 = new JPanel() ; 
        JButton choix1 = CreateButt.createTransparentButton("3", "labelchoix.png");
        JButton choix2 = CreateButt.createTransparentButton("4", "labelchoix.png");
    //labels => vertical 1 
        Vertical1.setLayout(new BorderLayout()); 
        Vertical1.add(choix1,BorderLayout.NORTH);
        Vertical1.add(choix2,BorderLayout.SOUTH);

Vertical1.setBackground(Color.MAGENTA); 

southChoix.add(Vertical1,BorderLayout.EAST); 


//row 2 
JPanel Vertical2 = new JPanel() ; 
        JButton choix3 = CreateButt.createTransparentButton("6", "labelchoix.png");
        JButton choix4 = CreateButt.createTransparentButton("10", "labelchoix.png");
     //labels => vertical 2
     Vertical2.setLayout(new BorderLayout()); 
     Vertical2.add(choix3,BorderLayout.NORTH);
     Vertical2.add(choix4,BorderLayout.SOUTH);
Vertical2.setBackground(Color.MAGENTA); 
     southChoix.add(Vertical2,BorderLayout.WEST); 


        /*---------------menu button-------  */
        JButton menu =   CreateButt.ButtonIcons( ""); 
        panel.add(menu); 

/*----------------partie li ndkhlhom kml fi b3dahum  */



       panel1.add(qstbar,BorderLayout.NORTH);
       panel1.add(southChoix,BorderLayout.SOUTH ); 

       setLocationRelativeTo(null);// centrer le frame
       background.add(panel,BorderLayout.EAST);
       background.add(panel1 ,BorderLayout.CENTER);
       background.add(panel2,BorderLayout.SOUTH);
       

       /*make the panels bg transparent  */
   panel.setOpaque(false);
   panel2.setOpaque(false);
   panel1.setOpaque(false);
   southChoix.setOpaque(false);
   Vertical1.setOpaque(false);
   Vertical2.setOpaque(false);
/*----------------------must do it-----------------  */

    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) throws Exception {
        new MathFacile1();
    }
}
