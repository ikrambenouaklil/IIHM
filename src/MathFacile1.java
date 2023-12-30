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
    //    setLayout(new BorderLayout());
        /* add background  */
        
        JLabel background=new JLabel(new ImageIcon("qst bg.png"));
        add(background);
        background.setLayout(new BorderLayout());
        
        /*------------------   add panels  -----------------*/
   
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
   
        panel.setBackground(Color.red);
        panel1.setBackground(Color.blue);
        panel2.setBackground(Color.yellow);
                

        // panel.setPreferredSize(new Dimension(100,100));//EAST
        // panel1.setPreferredSize(new Dimension(100,100));//CENTER
        // panel2.setPreferredSize(new Dimension(100,100));//SOUTH
   

             
       /*-----------------bar qst----------- */
        
        ImageIcon imageMATHQSTF = new ImageIcon("math1+2.png"); 
        JLabel qstbar = new JLabel();
        qstbar.setIcon(imageMATHQSTF);
        


        // les choix 

        JButton choix1 = CreateButt.createTransparentButton("3", "labelchoix.png");
        JButton choix2 = CreateButt.createTransparentButton("4", "labelchoix.png");
        JButton choix3 = CreateButt.createTransparentButton("6", "labelchoix.png");
        JButton choix4 = CreateButt.createTransparentButton("10", "labelchoix.png");
     
        /*---------------menu button-------  */
        JButton menu =   CreateButt.ButtonIcons( ""); 
        panel.add(menu); 

/*----------------partie li ndkhlhom kml fi b3dahum  */



       panel1.add(qstbar);
       panel1.add(choix1); 
       panel1.add(choix2);
       panel1.add(choix3);
       panel1.add(choix4);
       
       setLocationRelativeTo(null);// centrer le frame
       background.add(panel,BorderLayout.EAST);
       background.add(panel1 ,BorderLayout.CENTER);
       background.add(panel2,BorderLayout.SOUTH);

       /*make the panels bg transparent  */
    //  panel.setOpaque(false);
    //  panel2.setOpaque(false);
    //  panel1.setOpaque(false);
     
/*----------------------must do it-----------------  */

    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) throws Exception {
        new MathFacile1();
    }
}
