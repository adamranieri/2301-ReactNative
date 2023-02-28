package Tuesday.OOP.Abstraction.Shapes;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(3,4);
        Circle c = new Circle(10);

        printArea(r);
        printArea(c);


    }

    public static void printArea(Shape s) {
        System.out.println(s.getArea());
    }
}
