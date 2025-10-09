import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class AddTwoApplet extends JFrame implements ActionListener {
    JLabel l1 , l2 , result ;
    JButton addBtn;
    JTextField num1 , num2;
    public AddTwoApplet(){
        setTitle("Add two numbers");
        setLayout(new GridLayout(7,2,10,10));
        setSize(500,350);

        l1 = new JLabel("Num 1");
        num1 = new JTextField(15);
        l2 = new JLabel("Num 2");
        num2 = new JTextField(15);
        addBtn = new JButton("Add");
        result = new JLabel("Result");
        add(l1);add(num1);
        add(l2);add(num2);
        add(addBtn);
        add(result);
        setVisible(true);

        addBtn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent a){
        String  cmd = a.getActionCommand();
        int n1 = 0;
        int n2 = 0;
        int sum = 0 ;
        if(!num1.getText().isEmpty()){
            n1 = Integer.parseInt(num1.getText());
        }
        if(!num2.getText().isEmpty()){
            n2 = Integer.parseInt(num2.getText());
        } 

        if(cmd == "Add"){
            sum = n1 + n2;
        }
        result.setText(String.valueOf(sum));

    }

    public static void main(String args[]){
        new AddTwoApplet();
    }
}