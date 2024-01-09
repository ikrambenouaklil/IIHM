import java.awt.*;
import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.jar.JarFile;

// challenge 2 eme ta3 word and image  defficile  FOX 
public class picwordDEF1 extends JFrame {
        Font ghostKidAOEPro;

        picwordDEF1() throws FontFormatException, IOException {

                try {
                        ghostKidAOEPro = Font.createFont(Font.TRUETYPE_FONT, new File("GhostKidAOE_Pro.ttf"));
                        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
                        ge.registerFont(ghostKidAOEPro);
                } catch (FontFormatException | IOException e) {
                }
                // -------to change -------------------
                // -------------------bg-------------------
                JLabel background = new JLabel(new ImageIcon("qst bg.png"));
                ImageIcon imageMATHQSTF = new ImageIcon("fox.png"); // la question
                // --------------------les cohoix-----------------
                JButton choix1 = Create.createTransparentButton("Fanek", "labelchoix.png", 50);
                JButton choix2 = Create.createTransparentButton("Tiger", "labelchoix.png", 50);
                JButton choix3 = Create.createTransparentButton("Fox", "labelchoix.png", 50);
                JButton choix4 = Create.createTransparentButton("Cat", "labelchoix.png", 50);
                JButton menu = Create.ButtonIcons("menue.png"); // menu button
                // ----------------lktiba li mtht
                JPanel panel2 = new JPanel();
                JLabel qst = new JLabel();
                qst.setText("Which word matches the picture?");

                /*------------------   add frame  -----------------*/

                setSize(1000, 1000);
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

                // panel.setPreferredSize(new Dimension(100,100));//EAST
                // panel1.setPreferredSize(new Dimension(100,100));//CENTER
                // panel2.setPreferredSize(new Dimension(100,100));//SOUTH

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

        // public static void main(String[] args) throws Exception {
        //         new picwordDEF1();
        // }
}
