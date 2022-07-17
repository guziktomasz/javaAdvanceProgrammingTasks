package Task20_21_22;

public class Rectangle extends Shape{

    private final int a;
    private final int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double calculatePerimetr() {
        return 2*a + 2*b;
    }

    @Override
    public double calculateArea() {
        return a*b;
    }
}
