package Monday;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Data types");
        // primitive data types:
        // Numbers:
        int i = -3;
        i = 0;

        byte b = 120;
        short s = 1000;
        long l = 10000000000l; // if we put the l at the end of the number, we cast to long type

        double d = 0.45; // more precision/decimal places than a float: (15 digits)
        // cast the double value to float:
        float f = (float) 0.4; // (6-7 digits)

        boolean bool = true;
        bool = false;

        // characters can store a single character but if we want more we need a string:
        // characters and strings are different types
        // With characters, we use single-quotes (unlike strings which use "")
        char c = 'a';
        c = '1';
        c = '$';

        // Complex
        // Even though this looks like we're declaring the string like a primitive, it's actually a class
        String str = "Hello World";
        // this is how we normally instantiate classes:
        str = new String("Hello World");

        System.out.println(str.isEmpty());
        System.out.println(str.length());
        System.out.println(new String("").isEmpty());

        // get the character at the specified index:
        c = str.charAt(7);
        System.out.println(c);

        // valueOf
        str = String.valueOf(345.45);
        System.out.println(str);

        // substr:
        String str2 = "Hello Rory";
        System.out.println(str2.substring(0,5));
        // if we don't pass in an end index, it will just go to the end of the string:
        System.out.println(str2.substring(6));

        // These variables all point to the same spot in the String pool:
        String fruit1 = "apple";
        String fruit2 = "apple";
        String fruit3 = "apple";

        // Because we declared these with the new keyword, these won't exist in the String pool
        String name = new String("Rory");
        String name2 = new String("Rory");

        char c1 = 'f';
        System.out.println((int) c1);




    }
}
