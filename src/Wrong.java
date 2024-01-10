
import java.awt.*;
import javax.swing.*;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Wrong extends JFrame implements ActionListener {
    JButton replay;
    JButton out;

<<<<<<< Updated upstream
    Wrong(Object obj) throws FontFormatException, IOException {
        ImageIcon icon = new ImageIcon("BabyBearIcon.png");
=======
    Wrong() throws FontFormatException, IOException {
       ImageIcon icon = new ImageIcon("BabyBearIcon.png");
>>>>>>> Stashed changes
        setTitle("Baby Bear");
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Ajout d'un fond d'écran
        JLabel background = new JLabel(new ImageIcon("wrong-1.png"));
<<<<<<< Updated upstream

=======
        
>>>>>>> Stashed changes
        setContentPane(background);
        background.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setOpaque(false); // Rend le panneau transparent
        // Ajout de vos boutons avec les contraintes GridBag
<<<<<<< Updated upstream
        out = addButton(panel, "Menu.png", 0, 1);
        out.addActionListener(this);
        replay = addButton(panel, "REPLAY.png", 3, 1);
        replay.addActionListener(this);
=======
        addButton(panel, "Menu.png", 0, 1);
        addButton(panel, "REPLAY.png", 2, 1);
>>>>>>> Stashed changes
        // Ajout du panneau au bas du frame
        background.add(panel, BorderLayout.CENTER);
        setLocationRelativeTo(null); // Centrer le frame
        setVisible(true);
    }

    private JButton addButton(JPanel panel, String iconpath, int gridx, int gridy) {
        JButton button = Create.ButtonIcons(iconpath);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = gridx;
        constraints.gridy = gridy;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets.set(50, 0, 5, 5); // Marges
        panel.add(button, constraints);
        return button;

    }

    public Object replayobj(Object obj) {
        return obj;
    }

    public void actionPerformed(ActionEvent e5) {
        setVisible(false);
       
        if (e5.getSource() == out) {
            setVisible(false);
            try {
                new sections();
            } catch (FontFormatException | IOException e1) {
                e1.printStackTrace();
            }
        } else {
            setVisible(false);
            if (e5.getSource() == replay) {
                Object obj = replayobj(e5);
            }
        }
    }

}
