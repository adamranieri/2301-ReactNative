package FridayAndBeyond.CustomExceptions;

public class OddException extends Exception{

    public OddException() {
        super("Must not be an odd number");
    }

    public OddException(String message) {
        // we can call the parent constructor using super
        super(message);
    }
}
