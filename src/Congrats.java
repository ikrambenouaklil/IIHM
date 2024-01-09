import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.io.IOException;

public class Congrats extends JFrame implements ActionListener{

     JButton menu ;

    Congrats() throws FontFormatException, IOException {
        setTitle("Baby Bear");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Ajout d'un fond d'écran
        JLabel background = new JLabel(new ImageIcon("congratsbg.png"));
        setContentPane(background);
        background.setLayout(new BorderLayout());

    
        menu =  Create .ButtonIcons( "Group-15301.png");
        menu.addActionListener(this);


        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setOpaque(false); // Rend le panneau transparent

        // Ajout du panneau au bas du frame
        background.add(panel, BorderLayout.SOUTH);

        setLocationRelativeTo(null); // Centrer le frame
        setVisible(true);
    
       panel.add(menu);
    
         
    }

        public void actionPerformed(ActionEvent e) {
     
            if (e.getSource () == menu) {
                   setVisible(false);
               try {
               new Sld1 ();  }
                catch (FontFormatException | IOException e1) {
               // TODO Auto-generated catch block
               e1.printStackTrace();
           }
               }
            
}

    public static void main(String[] args) throws Exception {
        new Congrats();
    }
}
