import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.JOptionPane;

public class SwingApplet extends JFrame implements ActionListener{
    JLabel l1 , l2 , l3 , l4 ;
    JButton depostitea1Btn , depositea2Btn , withDrawa1Btn , withDrawa2Btn , transfera1_a2Btn , transfera2_a1Btn , clearBtn;
    JTextField amnt , balancefa1 , balancefa2; 
    int balancea1 , balancea2;
    public SwingApplet(){
        setSize(500,350);
        setLayout(new GridLayout(7,2,10,10));
        setTitle("Banking System");
        l1 = new JLabel("Amount");
        amnt = new JTextField(15);
        l2 = new JLabel("Balance A1");
        balancefa1 = new JTextField(15);
        balancefa1.setEditable(false);
        l3 = new JLabel("Balance A2");
        balancefa2 = new JTextField(15);
        balancefa2.setEditable(false);

        depostitea1Btn = new JButton("Deposit A1");

        depositea2Btn = new JButton("Deposit A2");

        withDrawa1Btn = new JButton("Withdraw A1");

        withDrawa2Btn = new JButton("Withdraw A2");
        transfera1_a2Btn = new JButton("Transfer A1->A2");
        transfera2_a1Btn = new JButton("Transfer A2->A1");
        clearBtn = new JButton("Clear");
        add(l1);add(amnt);
        add(l2);add(balancefa1);
        add(l3);add(balancefa2);
        add(depostitea1Btn);add(depositea2Btn);
        add(withDrawa1Btn);add(withDrawa2Btn);
        add(transfera1_a2Btn);add(transfera2_a1Btn);
        add(clearBtn);
        setVisible(true);

        depostitea1Btn.addActionListener(this);
        depositea2Btn.addActionListener(this);
        withDrawa1Btn.addActionListener(this);
        withDrawa2Btn.addActionListener(this);
        transfera1_a2Btn.addActionListener(this);
        transfera2_a1Btn.addActionListener(this);
        clearBtn.addActionListener(this);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e){
        String cmd = e.getActionCommand();
        int amt =0;
        
        if(!amnt.getText().isEmpty()){
            amt = Integer.parseInt(amnt.getText());
        }

        switch(cmd){
            case "Deposit A1":
                balancea1 += amt;
                break;
            case "Deposit A2":
                balancea2 += amt;
                break;
            case "Withdraw A1":
                if(amt <= balancea1){
                    balancea1 -= amt;
                } else {
                    JOptionPane.showMessageDialog(this, "Insufficient Balance in A1");
                }
                break;
            case "Withdraw A2":
                if(amt <= balancea2){
                    balancea2 -= amt;
                }else{
                    JOptionPane.showMessageDialog(this, "Insufficient Balance in A2");
                }
            case "Transfer A1->A2":
                if(amt <= balancea1){
                    balancea1 -= amt;
                    balancea2 += amt;
                }else{
                    JOptionPane.showMessageDialog(this, "Insufficient Balance in A1");
                } break;
            case "Transfer A2->A1":
                if(amt <= balancea2){
                    balancea2 -= amt;
                    balancea1 += amt;
                }else{
                    JOptionPane.showMessageDialog(this, "Insufficient Balance in A2");
                }break;
            case "Clear":
                amnt.setText("");
                balancea1 = 0;
                balancea2 = 0;
                break;
            default:
                JOptionPane.showMessageDialog(this, "Invalid Input");
                break;
        }
        balancefa1.setText(String.valueOf(balancea1));
        balancefa2.setText(String.valueOf(balancea2));


    }

    public static void main(String args[]){
        new SwingApplet();
    }
}