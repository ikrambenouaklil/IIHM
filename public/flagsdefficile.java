import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import java.io.File;
import java.io.IOException;

//palestine facile 
public class flagsdefficile extends JFrame implements ActionListener {
        Font ghostKidAOEPro;

        JButton choix1, choix2, choix3, choix4, menu;

        flagsdefficile() throws FontFormatException, IOException {

                try {
                        ghostKidAOEPro = Font.createFont(Font.TRUETYPE_FONT, new File("GhostKidAOE_Pro.ttf"));
                        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                        ge.registerFont(ghostKidAOEPro);
                } catch (FontFormatException | IOException e) {
                }
                // -------to change -------------------
                // -------------------bg-------------------//-------------------bg-------------------

                JLabel background = new JLabel(new ImageIcon("qst bg.png"));
                ImageIcon imageMATHQSTF = new ImageIcon("usa.png"); // la question
                // --------------------les cohoix-----------------
                choix1 = Create.createTransparentButton("Liberia", "labelchoix.png", 50);
                choix1.addActionListener(this);
                choix2 = Create.createTransparentButton("Norway", "labelchoix.png", 50);
                choix2.addActionListener(this);
                choix3 = Create.createTransparentButton("Australia", "labelchoix.png", 50);
                choix3.addActionListener(this);
                choix4 = Create.createTransparentButton("USA", "labelchoix.png", 50);
                choix4.addActionListener(this);
                menu = Create.ButtonIcons("menue.png"); // menu button
                menu.addActionListener(this);
                // ----------------lktiba li mtht
                JPanel panel2 = new JPanel();
                JLabel qst = new JLabel();
                qst.setText("Choose the right flag in the picture");
                qst.setText("Choose the right flag in the picture");

                /*------------------   add frame  -----------------*/

                this.setSize(Toolkit.getDefaultToolkit().getScreenSize());

                setTitle("Baby Bear");
                ImageIcon icon = new ImageIcon("BabyBearIcon.png");
                this.setIconImage(icon.getImage());
                /* add background */

                add(background);
                background.setLayout(new BorderLayout());

                /*------------------   add panels  -----------------*/

                JPanel panel = new JPanel();
                JPanel panel1 = new JPanel();

                GridBagConstraints gbc = new GridBagConstraints();
                GridBagLayout layout = new GridBagLayout();
                panel1.setLayout(layout);
                // test

                panel.setBackground(Color.red);
                panel1.setBackground(Color.blue);

                /*-----------------bar qst----------- */
                JLabel qstbar = new JLabel();
                qstbar.setIcon(imageMATHQSTF);

                gbc.gridx = 1;
                gbc.gridy = 0;
                gbc.gridwidth = 2;
                gbc.gridheight = 1;
                gbc.insets = new Insets(20, 0, 0, 0);
                panel1.add(qstbar, gbc);

                // les choix

                // -----------------------
                gbc.gridx = 1;
                gbc.gridy = 1;
                gbc.gridwidth = 1;

                gbc.insets = new Insets(0, 0, 0, 0);
                panel1.add(choix1, gbc);
                // -----------------------
                gbc.gridx = 2;
                gbc.gridy = 1;
                panel1.add(choix2, gbc);
                // -----------------------
                gbc.gridx = 1;
                gbc.gridy = 2;
                panel1.add(choix3, gbc);
                // -----------------------
                gbc.gridx = 2;
                panel1.add(choix4, gbc);

                /* qst */
                qst.setForeground(new Color(0X7E5001));
                qst.setFont(ghostKidAOEPro.deriveFont(Font.BOLD, 30));
                gbc.gridx = 0;
                gbc.gridy = 8;
                gbc.gridwidth = 4;
                gbc.gridheight = 1;
                gbc.insets = new Insets(20, 10, 0, 0);

                panel2.add(qst);
                gbc.fill = GridBagConstraints.HORIZONTAL;

                panel1.add(panel2, gbc);

                /*---------------menu button-------  */
                panel.add(menu);
                /*----------------partie li ndkhlhom kml fi b3dahum  */

                setLocationRelativeTo(null);// centrer le frame
                background.add(panel, BorderLayout.EAST);
                background.add(panel1, BorderLayout.CENTER);

                /* make the panels bg transparent */
                panel.setOpaque(false);
                panel1.setOpaque(false);
                panel2.setOpaque(false);

                /*----------------------must do it-----------------  */

                setVisible(true);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        }

        public void actionPerformed(ActionEvent e) {

                if (e.getSource() == choix4) {
                        setVisible(false);
                        try {
                                new flagsdefficile2();
                        } catch (FontFormatException | IOException e1) {
                                // TODO Auto-generated catch block
                                e1.printStackTrace();
                        }
                }

                else {
                        if (e.getSource() == menu) {
                                setVisible(false);
                                try {
                                        new sections();
                                } catch (FontFormatException | IOException e5) {
                                        // TODO Auto-generated catch block
                                        e5.printStackTrace();
                                }
                        }
                }

        }

}