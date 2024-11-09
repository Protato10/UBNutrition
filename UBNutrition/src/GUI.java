import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;


public class GUI {

    GameManager gm;
    JFrame frame;
    JTextArea messageText;
    JPanel bgPanel[]= new JPanel[10];
    JLabel bgLabel[] = new JLabel[10];

    public GUI(GameManager gm) {
        this.gm = gm;
        createMainField();
        createBackground();
        frame.setVisible(true);


    }

    public void createMainField() {
        frame = new JFrame();
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.black);
        frame.setLayout(null);

        messageText = new JTextArea("e");
        messageText.setBounds(50,400,700,150);
        messageText.setBackground(Color.black);
        messageText.setForeground(Color.white);
        messageText.setEditable(false);
        messageText.setLineWrap(true);
        messageText.setWrapStyleWord(true);
        messageText.setFont(new Font("Book Antiqua",Font.PLAIN,26));
        frame.add(messageText);
    }


    public void createBackground(){
        bgPanel[1]= new JPanel();
        bgPanel[1].setBounds(50,50,700,350);
        bgPanel[1].setBackground(Color.blue);
        bgPanel[1].setLayout(null);
        frame.add(bgPanel[1]);

        bgLabel[1] = new JLabel();
        bgLabel[1].setBounds(0,0,700,350);




        ImageIcon bgIcon = new ImageIcon(getClass().getResource("/images/fantasy-7464309_1280.png"));
        bgLabel[1].setIcon(bgIcon);

        bgLabel[1].add(bgLabel[1]);

    }





}
