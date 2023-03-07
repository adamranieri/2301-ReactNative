package FridayAndBeyond.Generics;

public class Sword {
    private int length;
    private double power;
    private String material;


    public Sword(int length, double power, String material) {
        this.length = length;
        this.power = power;
        this.material = material;
    }


    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
