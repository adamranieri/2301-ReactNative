package Tuesday.OOP.Inheritance.interfaces;

// if we make this class abstract, we won't have to implement the methods
public class FlyingFish implements Flying, Fins{

    @Override
    public void swim() {
        System.out.println("Swimming");
    }

    @Override
    public void fly() {
        System.out.println("Flying");

    }
}
