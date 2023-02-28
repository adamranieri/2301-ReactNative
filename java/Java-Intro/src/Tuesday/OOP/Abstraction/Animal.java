package Tuesday.OOP.Abstraction;

// we make the class abstract so we can fill it with abstract methods
// Thinking of this class as a contract; Any class that extends it is claiming to fill out these abstract methods with concrete implementations
public abstract class Animal {

    // this is an abstract method because it has no body and because we declared it with the subtract keyword:
    // this speak method will be filled out in the children classes:
    // "Every class that extends this should be able to speak"
    public abstract void speak();

    // We CAN have concrete methods (with body) in abstract class
    public void concreteMethod() {
        System.out.println("This is a concrete method");
    }




}
