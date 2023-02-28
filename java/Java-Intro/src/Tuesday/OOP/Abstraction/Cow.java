package Tuesday.OOP.Abstraction;

// because we are claiming to extend Animal, we have to fill out the abstract methods if we want this class to be concrete:
public class Cow extends Animal{
    // We need to override the abstract method in order to keep this class concrete:
    @Override
    public void speak() {
        System.out.println("Mooo!");
    }
}
