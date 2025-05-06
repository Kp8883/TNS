/**
 * This class represents a bank account with an account number and balance.
 * It includes methods to deposit, withdraw, and display balance.
 */
public class BankAccount {
    private int accountNumber;
    private double balance;

    /**
     * Constructor to initialize account number and initial balance.
     */
    public BankAccount(int accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    /**
     * Deposits a valid amount into the account.
     */
    public void deposit(double amount) throws InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Deposit amount must be greater than zero.");
        }
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    /**
     * Withdraws a valid amount from the account if funds are sufficient.
     */
    public void withdraw(double amount) throws InsufficientFundsException, InvalidAmountException {
        if (amount <= 0) {
            throw new InvalidAmountException("Withdrawal amount must be greater than zero.");
        }
        if (amount > balance) {
            throw new InsufficientFundsException("Insufficient balance for withdrawal.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }

    /**
     * Displays the current account balance.
     */
    public void displayBalance() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
    }
}
