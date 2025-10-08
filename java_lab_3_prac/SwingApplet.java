import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingApplet extends JFrame implements ActionListener {
    JLabel l1, l2, l3, l4, l5;
    JTextField nameField1, nameField2, amountField;
    JTextField balanceField1, balanceField2;
    JButton deposit1Btn, withdraw1Btn, deposit2Btn, withdraw2Btn, transferBtn, clearBtn;
    double balance1 = 0.0, balance2 = 0.0;

    public SwingApplet() {
        setTitle("Simple Banking System");
        setSize(500, 350);
        setLayout(new GridLayout(7, 2, 10, 10));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel("Account 1 Name:");
        nameField1 = new JTextField(15);

        l2 = new JLabel("Account 2 Name:");
        nameField2 = new JTextField(15);

        l3 = new JLabel("Amount:");
        amountField = new JTextField(10);

        l4 = new JLabel("Account 1 Balance:");
        balanceField1 = new JTextField("0.0", 10);
        balanceField1.setEditable(false);

        l5 = new JLabel("Account 2 Balance:");
        balanceField2 = new JTextField("0.0", 10);
        balanceField2.setEditable(false);

        deposit1Btn = new JButton("Deposit A1");
        withdraw1Btn = new JButton("Withdraw A1");
        deposit2Btn = new JButton("Deposit A2");
        withdraw2Btn = new JButton("Withdraw A2");
        transferBtn = new JButton("Transfer A1->A2");
        clearBtn = new JButton("Clear");

        // Add components
       
        add(l3); add(amountField);
        add(l4); add(balanceField1);
        add(l5); add(balanceField2);
        add(deposit1Btn); add(withdraw1Btn);
        add(deposit2Btn); add(withdraw2Btn);
        add(transferBtn); add(clearBtn);

        // Add listeners
        deposit1Btn.addActionListener(this);
        withdraw1Btn.addActionListener(this);
        deposit2Btn.addActionListener(this);
        withdraw2Btn.addActionListener(this);
        transferBtn.addActionListener(this);
        clearBtn.addActionListener(this);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String cmd = ae.getActionCommand();
        double amt = 0;

        try {
            if (!amountField.getText().isEmpty())
                amt = Double.parseDouble(amountField.getText());

            switch (cmd) {
                case "Deposit A1":
                    balance1 += amt; break;
                case "Withdraw A1":
                    if (amt <= balance1) balance1 -= amt;
                    else JOptionPane.showMessageDialog(this, "Insufficient balance in Account 1");
                    break;
                case "Deposit A2":
                    balance2 += amt; break;
                case "Withdraw A2":
                    if (amt <= balance2) balance2 -= amt;
                    else JOptionPane.showMessageDialog(this, "Insufficient balance in Account 2");
                    break;
                case "Transfer A1->A2":
                    if (amt <= balance1) {
                        balance1 -= amt;
                        balance2 += amt;
                    } else JOptionPane.showMessageDialog(this, "Insufficient balance in Account 1");
                    break;
                case "Clear":
                    nameField1.setText(""); 
                    nameField2.setText("");
                    amountField.setText(""); 
                    balance1 = 0; 
                    balance2 = 0;
            }

            balanceField1.setText(String.valueOf(balance1));
            balanceField2.setText(String.valueOf(balance2));

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Enter a valid number!");
        }
    }

    public static void main(String[] args) {
        new SwingApplet();
    }
}
