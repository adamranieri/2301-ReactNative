package Thursday.Java8Examples.FI;

// declare an interface called Raise
// it is a functional interface because it only has one abstract method:
@FunctionalInterface
public interface Raise {
    // one single abstract method:
    int calculate(int x);
}

