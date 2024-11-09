import javax.swing.*;
import java.awt.*;

public class GUI {

    public GUI(){

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        panel.setBorder(BorderFactory.createEmptyBorder(50,50,10, 50));
        panel.setLayout(new GridLayout(0,1));

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Nutrition GUI");
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new GUI();
    }
}
