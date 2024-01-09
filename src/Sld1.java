import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.io.IOException;

public class Sld1 extends JFrame implements ActionListener{ 




 Font ghostKidAOEPro ;

 ImageIcon text;
 JLabel bg;
 ImageIcon play;
 JButton Play;
 
//--- constructeur -------
 Sld1 () throws FontFormatException, IOException{


 /* -----frame --------------- */
 this.setTitle("Baby Bear");
 this.setSize(1000, 1000);
 ImageIcon icon = new ImageIcon("BabyBearIcon.png");
 this.setIconImage(icon.getImage());

/* -------background --------------- */
 bg= new JLabel(new ImageIcon("main page.png"));
 setContentPane(bg);
 bg.setLayout(new BorderLayout()); 

/*-------panel ------- */

 JPanel pan = new JPanel ();




 
 
 /* play button */
Play= Create .createTransparentButton("Play", "labelchoix.png", 50);
Play.addActionListener(this);

Play.setFocusable(false);
GridBagConstraints gbc = new GridBagConstraints();
GridBagLayout layout = new GridBagLayout();

 gbc.gridx = 2;
 gbc.gridy = 3;
 gbc.fill = GridBagConstraints.HORIZONTAL;
 gbc.insets.set(200, 0, 0, 0);
 pan.setLayout(layout);
 pan.setOpaque(false);
 pan.add(Play,gbc);
  
 bg.add(pan, BorderLayout.CENTER);

 /* we must do it */
 setLocationRelativeTo(null); // Centrer le frame
 this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 this.setVisible(true); 


 }

 public void actionPerformed(ActionEvent e) {
     
    if (e.getSource () == Play) {
           setVisible(false);
       try {
      new sections() ; }
        catch (FontFormatException | IOException e1) {
       // TODO Auto-generated catch block
       e1.printStackTrace();
   }
       }
    
    
    }

   

 public static void main(String[] args) throws FontFormatException, IOException {
 new Sld1 ();

 }
 
}