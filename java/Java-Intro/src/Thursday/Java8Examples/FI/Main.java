package Thursday.Java8Examples.FI;



public class Main {
    public static void main(String[] args) {
        // using our FI, we can store a lambda expression:
        Raise square = (int x) -> x * x;
        // Must make sure we match the method signature that we declared in the Interface:
//        Raise invalidLambda = (String x) -> true;
        Raise cube = (int x) -> x * x * x;
        Raise raiseToFour = (int x) -> x * x * x * x;

        calculateAndPrint(square, 3);
        calculateAndPrint(cube, 3);
        calculateAndPrint(raiseToFour, 3);
    }

    // Take in a lambda expression and applying it to the argument
    // and printing it out
    public static void calculateAndPrint(Raise r, int x) {
        int result = r.calculate(x);
        System.out.println("The result is : " + result);
    }

}
