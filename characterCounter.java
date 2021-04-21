import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


class appClass extends JFrame
{
    JTextField input;
    JButton btn;
    JLabel l,head;

    public appClass()
    {
    	setTitle("Character Counter");
    	head = new JLabel("CHARACTER COUNTER");
        input = new JTextField(10);
        btn = new JButton("COUNT");
        l = new JLabel();
        add(head);
        add(input);
        add(btn);
        add(l);
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String value = input.getText();
                int total=value.length();
                l.setText("Total Number of Characters: "+ total);
            }
        });

        setLayout(new FlowLayout());
        setSize(500,500);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

public class characterCounter {
    public static void main(String[] args) {
    	appClass obj = new appClass();
    }
}

