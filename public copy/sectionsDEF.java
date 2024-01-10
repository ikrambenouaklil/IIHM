
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import java.io.File;
import java.io.IOException;

public class sectionsDEF extends JFrame implements ActionListener {
    Font ghostKidAOEPro;
    JButton choix1, choix2, choix3, choix4, icomenu;
    public sectionsDEF() throws FontFormatException, IOException {
        try {
            ghostKidAOEPro = Font.createFont(Font.TRUETYPE_FONT, new File("GhostKidAOE_Pro.ttf"));
            GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
            ge.registerFont(ghostKidAOEPro);
        } catch (FontFormatException | IOException e) {

        }
        // -------to change -------------------
        // -------------------bg-------------------//-------------------bg-------------------

        JLabel background = new JLabel(new ImageIcon("sections.png"));

        choix1 = Create.createTransparentButton("Math", "sectionslabel.png", 28);
        choix1.addActionListener(this);
        choix2 = Create.createTransparentButton("Synonyms", "Group 3.png", 28);
        choix2.addActionListener(this);
        choix3 = Create.createTransparentButton("Pictures", "Group 6.png", 28);
        choix3.addActionListener(this);
        choix4 = Create.createTransparentButton("Flags", "Group 5.png", 28);
        choix4.addActionListener(this);

        // ---------button menu
        icomenu = Create.ButtonIcons("out.png");
        icomenu.setVerticalAlignment(SwingConstants.BOTTOM);
        icomenu.addActionListener(this);
        /*------------------   add frame  -----------------*/

        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());
      
        setTitle("Baby Bear");

        ImageIcon icon = new ImageIcon("BabyBearIcon.png");
        this.setIconImage(icon.getImage());
        /* add background */
        GridBagConstraints gbc = new GridBagConstraints();
        GridBagLayout layout = new GridBagLayout();
        background.setLayout(new BorderLayout());
        // background.setLayout(new BorderLayout());
        // --------------------
        JPanel pan = new JPanel();
        Border padding = new EmptyBorder(220, 0, 0, 0); // 10 pixels on all sides
        pan.setBorder(padding);
        pan.setLayout(layout);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;

        pan.add(choix1, gbc);
        // --------------------
        gbc.gridx = 2;

        pan.add(choix2, gbc);

        // --------------------
        gbc.gridy = 2;
        gbc.gridx = 1;
        pan.add(choix3, gbc);
        // --------------------
        gbc.gridx = 2;
        pan.add(choix4, gbc);
        background.add(pan, BorderLayout.NORTH);
        background.add(icomenu, BorderLayout.EAST);
        add(background);
        /* make the panels bg transparent */
        pan.setOpaque(false);
        /*----------------------must do it-----------------  */
        setLocationRelativeTo(null);// centrer le frame
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        if (e.getSource() == choix1) {
         
            try {
                new MathDef();
            } catch (FontFormatException | IOException e1) {
                e1.printStackTrace();
            }
        } else {
            if (e.getSource() == choix2) {
                
                try {
                    new SynonymsDEF();
                } catch (FontFormatException | IOException e2) {
                    // TODO Auto-generated catch block
                    e2.printStackTrace();
                }
            } else {
                if (e.getSource() == choix3) {
                   
                    try {
                        new picwordDEF();
                    } catch (FontFormatException | IOException e3) {
                        // TODO Auto-generated catch block
                        e3.printStackTrace();
                    }
                } else { if (e.getSource() == choix4) {
                       
                        try {
                            new flagsdefficile();
                        } catch (FontFormatException | IOException e4) {
                            e4.printStackTrace();
                        }

                    } else {
                      try {
                            new Sld1();
                        } catch (FontFormatException | IOException e5) {
                            // TO DO Auto-generated catch block
                            e5.printStackTrace();
                        }
                    }
                   
                    }
                }
            }


           
    }
public static void main(String[] args) throws FontFormatException, IOException {
    new sectionsDEF(); 
}
}
