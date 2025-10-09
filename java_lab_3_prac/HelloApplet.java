import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class HelloApplet extends JFrame implements ActionListener {

    JLabel l1;
    JButton btn;

    public HelloApplet(){
        setTitle("Hello World");
        setVisible(true);
        setSize(500,350);
        setLayout(new FlowLayout());

        l1 = new JLabel("Hello World");
        btn = new JButton("Click Me");
        add(l1);
        add(btn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn.addActionListener(this);


    }

    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();
        if(cmd == "Click Me"){
            l1.setText("Hi Joe");
        }
    }
    

    public static void main(String args[]){
        new HelloApplet();
    }
}