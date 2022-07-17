package Task20_21_22;

public class Triangle extends Shape{

    private final int a;
    private final int b;
    private final int c;
    private final int h;

    public Triangle(int a, int b, int c, int h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }



    @Override
    public double calculatePerimetr() {
        return a+b+c;
    }

    @Override
    public double calculateArea() {
        return (a*h)/(double)2;
    }
}
