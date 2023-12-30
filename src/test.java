import javax.swing.*;

import java.awt.*;

import java.awt.event.*;

class test extends JFrame
{


    public test() {

        setSize(400,400);
        setVisible(true);
        setLayout(new BorderLayout());// t9sm layout l north east west south 

        JLabel background=new JLabel(new ImageIcon("qst bg.png"));
        add(background);
        background.setLayout(new FlowLayout());
        
        JPanel panel = new JPanel(); 
        JButton hello = new JButton("hello");
        panel.add(hello); 

       JPanel panel2 = new JPanel(); 
       JButton hello2= new JButton("hello");
       panel2.add(hello2); 
panel.setOpaque(false);
panel2.setOpaque(false);
       background.add(panel); 
       background.add(panel2); 

        
    }

    public static void main(String args[]) 
    {
        new test();
    }
}