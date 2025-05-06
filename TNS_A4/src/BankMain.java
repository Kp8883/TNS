import java.util.Scanner;

/**
 * Driver class to demonstrate deposit and withdrawal with exception handling.
 */
public class BankMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create BankAccount object
        BankAccount account = new BankAccount(1001, 5000.0);

        try {
            // Deposit operation
            System.out.print("Enter deposit amount: ");
            double depositAmount = sc.nextDouble();
            account.deposit(depositAmount);

            // Withdrawal operation
            System.out.print("Enter withdrawal amount: ");
            double withdrawAmount = sc.nextDouble();
            account.withdraw(withdrawAmount);
        } catch (InvalidAmountException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("\nTransaction Completed.");
            account.displayBalance();
        }

        sc.close();
    }
}
