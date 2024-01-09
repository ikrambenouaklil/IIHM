import java.awt.*;
import javax.swing.*;
import java.io.IOException;

public class Correct extends JFrame {

    Correct() throws FontFormatException, IOException {
        setTitle("Baby Bear");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Ajout d'un fond d'écran
        JLabel background = new JLabel(new ImageIcon("correct -1.png"));
        setContentPane(background);
        background.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setOpaque(false); // Rend le panneau transparent

        // Ajout de vos boutons avec les contraintes GridBag
        addButton(panel, "Groupwc1.png", 0, 1);
        //addButton(panel, "Groupwc2.png", 1, 1);
        //addButton(panel, "Groupwc3.png", 2, 1);
        addButton(panel, "Groupwc4.png", 3, 1);

        // Ajout du panneau au bas du frame
        background.add(panel, BorderLayout.CENTER);

        setLocationRelativeTo(null); // Centrer le frame
        setVisible(true);
    }

    private void addButton(JPanel panel, String iconpath, int gridx, int gridy) {
        JButton button = Create.ButtonIcons(iconpath);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = gridx;
        constraints.gridy = gridy;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets.set(40, 0, 5, 5); // Marges

        panel.add(button, constraints);
    }

    public static void main(String[] args) throws Exception {
        new Correct();
    }
}
