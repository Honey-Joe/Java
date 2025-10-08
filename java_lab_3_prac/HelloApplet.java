import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/* <applet code="BankingApplet.class" width="500" height="350"></applet> */

public class HelloApplet extends Applet implements ActionListener {
    Label l1, l2, l3, l4, l5;
    TextField nameField1, nameField2, amountField;
    TextField balanceField1, balanceField2;
    Button deposit1Btn, withdraw1Btn, deposit2Btn, withdraw2Btn, transferBtn, clearBtn;
    double balance1 = 0.0, balance2 = 0.0;

    public void init() {
        setLayout(new GridLayout(7, 2, 10, 10));

        l1 = new Label("Account 1 Name:");
        nameField1 = new TextField(15);

        l2 = new Label("Account 2 Name:");
        nameField2 = new TextField(15);

        l3 = new Label("Amount:");
        amountField = new TextField(10);

        l4 = new Label("Account 1 Balance:");
        balanceField1 = new TextField("0.0", 10);
        balanceField1.setEditable(false);

        l5 = new Label("Account 2 Balance:");
        balanceField2 = new TextField("0.0", 10);
        balanceField2.setEditable(false);

        deposit1Btn = new Button("Deposit A1");
        withdraw1Btn = new Button("Withdraw A1");
        deposit2Btn = new Button("Deposit A2");
        withdraw2Btn = new Button("Withdraw A2");
        transferBtn = new Button("Transfer A1->A2");
        clearBtn = new Button("Clear");

        // add(l1); add(nameField1);
        // add(l2); add(nameField2);
        add(l3); add(amountField);
        add(l4); add(balanceField1);
        add(l5); add(balanceField2);

        add(deposit1Btn); add(withdraw1Btn);
        add(deposit2Btn); add(withdraw2Btn);
        add(transferBtn); add(clearBtn);

        deposit1Btn.addActionListener(this);
        withdraw1Btn.addActionListener(this);
        deposit2Btn.addActionListener(this);
        withdraw2Btn.addActionListener(this);
        transferBtn.addActionListener(this);
        clearBtn.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        String cmd = ae.getActionCommand();
        double amt = 0;

        try {
            if (!amountField.getText().isEmpty())
                amt = Double.parseDouble(amountField.getText());

            switch(cmd) {
                case "Deposit A1":
                    balance1 += amt; break;
                case "Withdraw A1":
                    if (amt <= balance1) balance1 -= amt;
                    else showStatus("Insufficient balance in Account 1"); break;
                case "Deposit A2":
                    balance2 += amt; break;
                case "Withdraw A2":
                    if (amt <= balance2) balance2 -= amt;
                    else showStatus("Insufficient balance in Account 2"); break;
                case "Transfer A1->A2":
                    if (amt <= balance1) {
                        balance1 -= amt;
                        balance2 += amt;
                    } else showStatus("Insufficient balance in Account 1"); break;
                case "Clear":
                    nameField1.setText(""); nameField2.setText("");
                    amountField.setText(""); balance1=0; balance2=0;
            }

            balanceField1.setText(String.valueOf(balance1));
            balanceField2.setText(String.valueOf(balance2));

        } catch (NumberFormatException e) {
            showStatus("Enter a valid number!");
        }
    }
}
