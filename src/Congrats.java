import java.awt.*;
import javax.swing.*;
import java.io.IOException;

public class Congrats extends JFrame {

    Congrats() throws FontFormatException, IOException {
        setTitle("Baby Bear");
        setSize(1000, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Ajout d'un fond d'écran
        JLabel background = new JLabel(new ImageIcon("congratsbg.png"));
        setContentPane(background);
        background.setLayout(new BorderLayout());

        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setOpaque(false); // Rend le panneau transparent

        // Ajout de vos boutons avec les contraintes GridBag
        addButton(panel, "Group-15301.png", 0, 0);
        addButton(panel, "Group-15302.png", 1, 0);
        addButton(panel, "Group-15303.png", 2, 0);

        // Ajout du panneau au bas du frame
        background.add(panel, BorderLayout.SOUTH);

        setLocationRelativeTo(null); // Centrer le frame
        setVisible(true);
    }

    private void addButton(JPanel panel, String iconpath, int gridx, int gridy) {
        JButton button = Create.ButtonIcons(iconpath);
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.gridx = gridx;
        constraints.gridy = gridy;
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets.set(5, 5, 5, 5); // Marges

        // Si c'est le dernier bouton, placez-le en bas de la grille
        if (gridy == 0) {
            constraints.weighty = 1.0; // Permet au composant de s'étendre verticalement
            constraints.anchor = GridBagConstraints.PAGE_END; // Ancrage en bas
        }

        panel.add(button, constraints);
    }

    public static void main(String[] args) throws Exception {
        new Congrats();
    }
}
