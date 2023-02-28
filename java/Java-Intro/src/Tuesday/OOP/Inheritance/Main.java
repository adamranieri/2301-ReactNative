package Tuesday.OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        Animal bowser = new Animal("dragon", "Bowser", 2, false, "Bwa ha ha");
        Animal rhino = new Animal("rhino", "Rhyan", 4, true, "Rhino noises");
        Animal mufasa = new Animal("lion", "Mufasa", 4, true, "Everything the light touches is ours.");

        bowser.speak();
        rhino.speak();
        mufasa.speak();

        bowser.whichClass();

        Mammal perry = new Mammal("Platypus", "Perry", 4, "Platypus noises");
        System.out.println(perry.isWarmBlooded());
        perry.whichClass();
        perry.speak();

        Cat ashes = new Cat("Ashes", "Maine Coone");
        ashes.speak();
        ashes.whichClass();
        System.out.println(ashes.getBreed());

        // Polymorphism
        Animal obj1 = new Mammal("dog", "Scooby", 4, "Ruh roh");
        // we can't go "up" the chain when declaring objects:
//        Mammal obj2 = new Animal();
        // Even though we declared this object as a animal, at runtime we see that it is a mammal so it calls the mammal method:
        obj1.whichClass();



    }
}
