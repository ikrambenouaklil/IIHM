import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingTemplate extends JFrame {

    public SwingTemplate() {
        // Set the title of the JFrame
        setTitle("Java Swing Template");

        // Set the default close operation
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a JButton
        JButton clickButton = new JButton("Click Me");

        // Add an ActionListener to the button
        clickButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Code to be executed when the button is clicked
                JOptionPane.showMessageDialog(SwingTemplate.this, "Button Clicked!");
            }
        });

        // Add the button to the JFrame
        getContentPane().add(clickButton);

        // Set the layout manager (null for absolute positioning)
        setLayout(null);

        // Set the size of the JFrame
        setSize(300, 200);

        // Set the JFrame to be visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the GUI code on the Event Dispatch Thread (EDT)
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SwingTemplate();
            }
        });
    }
}
