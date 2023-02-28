package Tuesday.OOP.Polymorphism;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1,2));
        System.out.println(calculator.add(1,2,3));
        System.out.println(calculator.add(1.0,2.5));
        // at compile time, we know which method is going to be called
        System.out.println(calculator.add(3, 5.4));
    }
}
