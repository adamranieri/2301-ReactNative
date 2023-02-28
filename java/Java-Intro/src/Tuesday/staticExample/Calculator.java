package Tuesday.staticExample;

public class Calculator {
    int id;
    // The only instance of this variable in the entire program:
    static final double PI = 3.14159;

    public Calculator() {
        // all instances are aware of the static variables of the class
        System.out.println(Calculator.PI);
    }

    public static void main(String[] args) {
        // we don't need an instance of a calculator in order to access that variable
        System.out.println(Calculator.PI);
        // we couldn't access non-static variables from this context
//        System.out.println(this.id);
        Calculator calculator = new Calculator();
        // we CAN access id from non-static:
        System.out.println(calculator.id);
    }
}
