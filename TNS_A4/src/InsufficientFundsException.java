// Custom exception for withdrawal when balance is insufficient
public class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String message) {
        super(message);
    }
}

//Custom Exceptions (InsufficientFundsException, InvalidAmountException) provide clear error handling tailored to banking logic.
//
//Using try-catch-finally blocks ensures safe program execution even when invalid operations occur.
//
//The finally block ensures that balance display and resource closure (e.g., Scanner) are always executed.