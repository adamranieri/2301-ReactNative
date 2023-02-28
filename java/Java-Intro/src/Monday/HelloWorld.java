package Monday;

public class HelloWorld {
    // This method declaration is specific to the main method
    // The main method is what runs when we execute the class
    public static void main(String []args) {
        // body: what runs when we execute our program
        // Using the System class, we access the out stream and invoke the println method to print the message "Hello World"
        // to our console:
        System.out.println("Hello World");
        data();
    }

    public static void data() {
        System.out.println("Data method");
    }
}
