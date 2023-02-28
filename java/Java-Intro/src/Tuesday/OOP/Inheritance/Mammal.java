package Tuesday.OOP.Inheritance;

// We inherit from the class by using the extends keyword:
public class Mammal extends Animal{
    // With this new class, we have no constructor yet so Java wants to create
    // a new default constructor with no args. It also wants to call the parent constructor within that constructor
    // But because we didn't define a no-args constructor in the parent, we're going to get "yelled at" by the compiler
    // until we either:
    // 1. Make a no-args constructor in Animal
    // 2. Define a constructor in Mammal

    public Mammal() {
        // trying to call the Animal no-args constructor which means we have to make sure one actually exists
        super();
    }

    // we make a parameterized constructor for the mammal but we can leave out the warmBlooded field because
    // mammals are guaranteed to be warm-blooded:
    public Mammal(String species, String name, int legs, String sound) {
        // call the parent parameterized constructor:
        super(species, name, legs, true, sound); // all mammals are warm-blooded so we can hard-code in true
    }

    @Override // annotation indicates that we are overriding a method:
    public void whichClass() {
        System.out.println("This is the mammal class.");
    }
}
