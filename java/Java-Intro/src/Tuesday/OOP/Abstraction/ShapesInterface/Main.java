package Tuesday.OOP.Abstraction.ShapesInterface;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(3,5);
        System.out.println(rectangle.getArea());
        rectangle.concreteDefault();
        // static methods called from class:
        Shape.concreteStatic();
    }
}
