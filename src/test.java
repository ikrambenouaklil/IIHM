import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

class test extends JFrame
{


    public test() {
setSize(120 ,120);
        // Create panels with desired backgrounds
JPanel pan1 = new JPanel();
pan1.setBackground(Color.RED);

JPanel pan2 = new JPanel();
pan2.setBackground(Color.YELLOW);

JPanel pan3 = new JPanel();
pan3.setBackground(Color.BLUE);

JPanel pan4 = new JPanel();
pan4.setBackground(Color.GRAY);

JPanel pan5 = new JPanel();
pan5.setBackground(Color.ORANGE);

// Set GridBagLayout and constraints

setLayout(new GridBagLayout());

GridBagConstraints c = new GridBagConstraints();

// Position pan1 in the north
c.gridheight = 1;
c.gridwidth = GridBagConstraints.REMAINDER;
c.fill = GridBagConstraints.HORIZONTAL;
add(pan1, c);

// Position pan2 and pan3 in parallel rows below pan1
c.gridy = 1;
c.gridwidth = 1;
add(pan2, c);

c.gridx = 1;
add(pan3, c);

// Position pan4 and pan5 in parallel rows below pan2 and pan3
c.gridy = 2;
c.gridx = 0;
add(pan4, c);

c.gridx = 1;
add(pan5, c);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true); 
// Add the this to your frame

        
    }

    public static void main(String args[]) 
    {
        new test();
    }
}