import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BabyBear extends JFrame {

    public  BabyBear() {
        // Set the title of the JFrame
        setTitle("Little Bear ");

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JButton
        JButton clickButton = new JButton("Click Me");

        // Add an ActionListener to the button
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to be executed when the button is clicked
                JOptionPane.showMessageDialog( BabyBear.this, "Button Clicked!");
            }
        });

        // Add the button to the JFrame
        getContentPane().add(clickButton);

        // Set the layout manager (null for absolute positioning)
        setLayout(null);

        // Set the size of the JFrame
        setSize(1440, 200);

        // Set the JFrame to be visible
        setVisible(true);
    }

    public static void main(String[] args) {
    new  BabyBear();
    }
}

