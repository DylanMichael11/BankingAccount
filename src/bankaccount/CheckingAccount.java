package bankaccount;

public class CheckingAccount extends BankAccount {
    private double interestRate;
    private final double overdraftFee = 30.00;

    // Constructor
    public CheckingAccount() {
        super(); // Call the superclass constructor
    }

    // Set interest rate
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    // Get interest rate
    public double getInterestRate() {
        return interestRate;
    }

    // Process withdrawal with overdraft
    public void processWithdrawal(double amount) {
        double currentBalance = getBalance();
        if (amount > currentBalance) {
            double newBalance = currentBalance - amount - overdraftFee;
            System.out.println("Overdraft! An additional fee of $30 has been applied.");
            System.out.println("New balance: $" + newBalance);
        } else {
            withdrawal(amount);
            System.out.println("Withdrawal successful. New balance: $" + getBalance());
        }
    }

    // Display account details
    public void displayAccount() {
        accountSummary(); // Call superclass method
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
