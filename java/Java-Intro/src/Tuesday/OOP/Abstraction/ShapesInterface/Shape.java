package Tuesday.OOP.Abstraction.ShapesInterface;

public interface Shape {
    // can't do this:
//    public void concrete() {
//        System.out.println("This is a concrete method");
//    }

    // can only have abstract methods *
    // Don't need the abstract keyword
    double getArea();

    // We CAN have concrete methods if we use the default keyword
    default void concreteDefault() {
        System.out.println("This is a concrete method");
    }

    static void concreteStatic() {
        System.out.println("This is a static method on an interface");
    }
}
