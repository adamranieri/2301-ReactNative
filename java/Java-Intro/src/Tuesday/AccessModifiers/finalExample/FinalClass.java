package Tuesday.AccessModifiers.finalExample;

//public final class FinalClass {
public class FinalClass {
    public final void print() {
        System.out.println("Hello World");
    }

    // we can apply final to parameters to prevent them from being reassigned:
    public void print2(final String message) {
//        message = "New message";
        System.out.println(message);
    }

    public static void main(String[] args) {
        FinalClass finalClass = new FinalClass();
        finalClass.print2("This is my message");
    }


}
