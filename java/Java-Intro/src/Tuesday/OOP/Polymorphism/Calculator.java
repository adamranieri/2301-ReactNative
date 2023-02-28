package Tuesday.OOP.Polymorphism;
// With overloading, we can have methods with the same name but different parameters:
public class Calculator {
    public int add(int x, int y) {
        return x + y;
    }

// We CANNOT overload a method with the exact same parameter types/order:
//    public int add(int y, int x) {
//        return y + x;
//    }

    // Change the number of parameters:
    public int add(int x, int y, int z) {
        return x + y + z;
    }

    // Change the type:
    public double add(double x, double y) {
        return x + y;
    }

    // Change the order:
    public double add(int x, double y) {
        return x + y;
    }

    public double add(double x, int y) {
        return x + y;
    }
}
