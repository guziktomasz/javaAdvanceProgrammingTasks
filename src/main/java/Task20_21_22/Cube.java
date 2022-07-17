package Task20_21_22;

public class Cube extends _3DShape{

    private final int a;

    public Cube(int a) {
        this.a = a;
    }

    @Override
    public double calculatePerimetr() {
        throw new UnsupportedOperationException("Szścian nie ma obwodu");
    }

    @Override
    public double calculateArea() {
        return 6*Math.pow(a, 2);
    }

    @Override
    public double calculateVolume() {
        return a*a*a;
    }
}
