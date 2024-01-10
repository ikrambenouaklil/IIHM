import java.awt.*;
import javax.swing.*;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CorrectPic2 extends Correct {

    CorrectPic2() throws FontFormatException, IOException {
    }
    public void actionPerformed(ActionEvent e) {
setVisible(false);
        if (e.getSource() == out) { 
            try {
                new sections();
            } catch (FontFormatException | IOException e1) {
                e1.printStackTrace();
            }
        }else{
            if (e.getSource() == back){
        try {
                new Congrats();
            } catch (FontFormatException | IOException e1) {
                e1.printStackTrace(); } } }}    
           
    }

   

