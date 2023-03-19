package exceptions;

public class NumbersException extends RuntimeException {
    public NumbersException(String msg) {
        super(msg);
    }

    public NumbersException(String msg, NumberFormatException cause) {
        super(msg, cause);
    }
}
