// Custom exception for invalid deposit/withdrawal amounts (like negative values)
public class InvalidAmountException extends Exception {
    public InvalidAmountException(String message) {
        super(message);
    }
}
