
import java.awt.*;
import javax.swing.*;
import java.io.IOException;
import java.sql.Array;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Correct extends JFrame implements ActionListener {

    JButton out;
    JButton back;

    Correct(Object obj) throws FontFormatException, IOException {
        setTitle("Baby Bear");
        ImageIcon icon = new ImageIcon("BabyBearIcon.png");
        this.setSize(Toolkit.getDefaultToolkit().getScreenSize());

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Ajout d'un fond d'écran
        JLabel background = new JLabel(new ImageIcon("correct -1.png"));
        setContentPane(background);
        background.setLayout(new BorderLayout());
        JPanel panel = new JPanel();
        panel.setLayout(new GridBagLayout());
        panel.setOpaque(false); // Rend le panneau transparent
        // Ajout de vos boutons avec les contraintes GridBag
        out = addButton(panel, "Menu.png", 0, 1);
        out.addActionListener(this);
        back = addButton(panel, "NEXT.png", 3, 1);
        back.addActionListener(this);
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
        constraints.insets.set(40, 0, 5, 5); // Marges
        panel.add(button, constraints);
        return button;
    }

    public Object replayobj(Object obj ) {
       return obj ; 
    }

    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        if (e.getSource() == out) {
            try {
                
                new sections();
                setVisible(false);
            } catch (FontFormatException | IOException e1) {
                e1.printStackTrace();
            }
        } else {
            setVisible(false);
            Class cls = e.getClass();  
            Object obj = replayobj(e);
          
            
        }
    }

}
