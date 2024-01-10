import java.awt.*;
import javax.swing.*;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CorrectPic extends Correct {

    CorrectPic() throws FontFormatException, IOException {

    }

    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        if (e.getSource() == out) {

            try {
                new sections();
            } catch (FontFormatException | IOException e1) {
                e1.printStackTrace();

            }
        } else {
            if (e.getSource() == back) {
                try {
                    new picword();
                } catch (FontFormatException | IOException e1) {
                    e1.printStackTrace();

                }
            }

        }
    }

    public static void main(String[] args) throws Exception {
        CorrectPic correctPalestine = new CorrectPic();

    }

}
