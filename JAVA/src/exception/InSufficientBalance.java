package exception;

public class InSufficientBalance extends Exception {
    @Override
    public String getMessage() {
        return "InsufficientBalance";
    }
}
