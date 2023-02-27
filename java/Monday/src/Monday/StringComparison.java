package Monday;

public class StringComparison {
    public static void main(String[] args) {
        String s1 = "Rory";
        String s2 = "Rory";
        // In practice, we would probably just declare it like s1 and s2 anyways
        String s3 = new String("Rory");

        // == compares the memory reference
        System.out.println(s1 == s2); // true, occupying the same space in memory, thanks to the string pool
        System.out.println(s1 == s3); // false, declaring as a new object, occupying a different space in memory

        // .equals compares the values of the 2 objects (for String class)
        System.out.println(s1.equals(s2)); // true
        System.out.println(s1.equals(s3)); // true, even though it's the same spot in memory

        // When we make a new class and don't override the .equals method, the default implementation is comparing the reference
        /*
        Animal a1 = new Animal();
        Animal a2 = new Animal();
        // Assuming we didn't override the .equals method of the Animal class, the following code would still compare reference:
        a1.equals(a2);
         */

        String s4 = "1";
        int i = 1;

        // can't even use the == for different types:
//        System.out.println(s4 == i);
        // Java does not return true for different types:
        System.out.println(s4.equals(i));


    }
}
