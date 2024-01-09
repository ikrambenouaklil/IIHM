import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import java.io.File;
import java.io.IOException;
import java.util.jar.JarFile;
//palestine facile 
public class sections extends JFrame {
        Font ghostKidAOEPro ;
        


    sections() throws FontFormatException, IOException{

     
     try {
         ghostKidAOEPro= Font.createFont(Font.TRUETYPE_FONT, new File("GhostKidAOE_Pro.ttf"));
         GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
         ge.registerFont(ghostKidAOEPro);
        }catch (FontFormatException | IOException e) {
        } 
        //-------to change -------------------
//-------------------bg-------------------//-------------------bg-------------------

        JLabel background=new JLabel(new ImageIcon("sections.png"));
    
        JButton choix1 = Create .createTransparentButton("Math", "sectionslabel.png", 28);
        JButton choix2 = Create .createTransparentButton("Synonyms", "sectionslabel.png", 28);
        JButton choix3 = Create .createTransparentButton("Pictures", "sectionslabel.png", 28);
        JButton choix4 = Create .createTransparentButton("Flags", "sectionslabel.png",28 );
        JButton menu =   Create .ButtonIcons( "out.png"); // menu button 
    
//---------button menu 
JButton icomenu = Create.ButtonIcons( "out.png");
        icomenu.setVerticalAlignment(SwingConstants.BOTTOM);

        /*------------------   add frame  -----------------*/

        
        
        setSize(1000, 1000);
        setTitle("Baby Bear");
        
  ImageIcon icon = new ImageIcon("BabyBearIcon.png");
  this.setIconImage(icon.getImage());
        /* add background  */
         GridBagConstraints gbc = new  GridBagConstraints(); 
         GridBagLayout layout = new GridBagLayout(); 
       background.setLayout(new BorderLayout()); 
       //  background.setLayout(new BorderLayout());
 //--------------------
 JPanel pan = new JPanel() ;
Border padding = new EmptyBorder(220, 0, 0, 0); // 10 pixels on all sides
pan.setBorder(padding);
 pan.setLayout(layout);
           gbc.gridx=1;      
           gbc.gridy=0; 
           gbc.fill= GridBagConstraints.BOTH; 
           gbc.gridwidth=1;
         gbc.gridheight=1; 



         pan.add(choix1, gbc);
//--------------------
             gbc.gridx=2;      
             
             pan.add(choix2, gbc);
            
//--------------------
gbc.gridy=2;      
    gbc.gridx=1;           
       pan.add(choix3, gbc);
  //--------------------
       gbc.gridx=2;      
             
       pan.add(choix4,gbc);
       background.add(pan,BorderLayout.NORTH);
    background.add(icomenu,BorderLayout.EAST);
        add(background);
       

            
             
            
  


             

     
                

     
    
        
   



        
       /*make the panels bg transparent  */
 pan.setOpaque(false);
    

       
     
       
      
     
/*----------------------must do it-----------------  */
    setLocationRelativeTo(null);// centrer le frame
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    // public static void main(String[] args) throws Exception {
    //     new sections();
    // }
}
