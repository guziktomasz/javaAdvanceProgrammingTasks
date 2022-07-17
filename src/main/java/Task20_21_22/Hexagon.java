package Task20_21_22;

public class Hexagon extends Shape{
    private final int a;

    public Hexagon(int a) {
        this.a = a;
    }

    @Override
    public double calculatePerimetr() {
        return 6*a;
    }

    @Override
    public double calculateArea() {
        return 3*Math.pow(a, 2)* Math.sqrt(3) / (double) 2;
    }
}
