class BankAccount {
    // Private attributes (Encapsulation)
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructor to initialize the account
    public BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;

        // Ensure initial balance is valid (non-negative)
        if (balance >= 0)
            this.balance = balance;
        else
            this.balance = 0;
    }

    // Getter methods
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    // Setter method for balance with validation
    public void setBalance(double balance) {
        if (balance >= 0)
            this.balance = balance;
        else
            System.out.println("Invalid balance amount. Balance cannot be negative.");
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited ₹" + amount);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Successfully withdrawn ₹" + amount);
        } else if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    // Display method
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: ₹" + balance);
    }
}

// Main class
class q9a {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(101, "Honey Joe", 5000);

        acc.displayAccountInfo();
        acc.deposit(1500);
        acc.withdraw(2000);
        acc.setBalance(-1000); // Invalid update
        acc.displayAccountInfo();
    }
}
