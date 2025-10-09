import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Regular extends JFrame implements ActionListener {
    JButton red, green, blue;

    public Regular() {
        setTitle("Color Change");
        setSize(500, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout()); // smaller gaps

        red = new JButton("Red");
        green = new JButton("Green");
        blue = new JButton("Blue");

        add(red, BorderLayout.WEST);
        add(green, BorderLayout.CENTER);
        add(blue, BorderLayout.EAST);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String cmd = e.getActionCommand();

        if(cmd.equals("Red")){
            getContentPane().setBackground(Color.RED);
        } else if(cmd.equals("Green")){
            getContentPane().setBackground(Color.GREEN);
        } else if(cmd.equals("Blue")){
            getContentPane().setBackground(Color.BLUE);
        }
    }

    public static void main(String[] args){
        new Regular();
    }
}
