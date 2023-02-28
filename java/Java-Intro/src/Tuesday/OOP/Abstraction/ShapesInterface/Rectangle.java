package Tuesday.OOP.Abstraction.ShapesInterface;

// we CAN implement multiple interfaces, separated by commas:
public class Rectangle implements Shape, Quadrilerateral{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public void quad() {
        System.out.println("Quad method");
    }
}
