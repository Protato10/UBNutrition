import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class GUI implements ActionListener {


    int count = 0;

    private JPanel panel;

    private JFrame frame;
    private JLabel label;
    private JTextField textField;
    private JButton button1;
    private JButton button2;

    public GUI(){

        frame = new JFrame();
        panel = new JPanel();
        label = new JLabel("Number of clicks: 0");
        textField = new JTextField();
        button1 = new JButton("Enter");
        button1.addActionListener(this);

        panel.setBorder(BorderFactory.createEmptyBorder(100,100,100, 100));
        panel.setLayout(new GridLayout(0,1));
        //panel.add(label);
        //panel.add(textField);
        panel.add(button1);

        frame.add(panel,BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Nutrition GUI");
        frame.pack();
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("Number of clicks: " +count);
    }
}
