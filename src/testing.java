import javax.swing.*;
import java.awt.*;

public class testing extends JFrame{
    public static void main (String[] args){
        testing frame = new testing();
        frame.setTitle("Cards");
        frame.setSize(300,200);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    private ImageIcon Card1 = new ImageIcon("C:/Users/Paul/Desktop/Poker Cards/Clubs1/2C.png");
    private ImageIcon Card2 = new ImageIcon("C:/Users/Paul/Desktop/Poker Cards/Clubs1/3C.png");
    private ImageIcon Card3 = new ImageIcon("C:/Users/Paul/Desktop/Poker Cards/Clubs1/4C.png");

    public testing(){
        setLayout(new GridLayout(1,4,5,5));
        add(new JLabel(Card1));
        add(new JLabel(Card2));
        add(new JLabel(Card3));
    }

}
