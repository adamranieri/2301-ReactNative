package Tuesday.AccessModifiers.finalExample;

class Cat {
    String name;
}

public class Main {
    public static void main(String[] args) {
        final int x = 3;
        // can't reassign final variable:
//        x = 2;

        final Cat cat = new Cat();
        // we can't reassign this to a new value
//        cat = new Cat();
        // we CAN reassign fields of a final object (assuming that the field itself isn't final)
        cat.name = "Ashes";
    }
}
