package Task15;

public enum Car {
    FERRARI(100500.00, 120),
    PORSCHE(200400.00, 130),
    MERCEDES(2400200.00, 140),
    BMW(500300.00, 150),
    OPEL(300900.00, 160),
    FIAT(300100.00, 170),
    TOYOTA(400400.00, 180);

    private double price;
    private int power;

    Car(double price, int power) {
        this.price = price;
        this.power = power;
    }

    public boolean isPremium(boolean valuePremium){
        isRegular(!valuePremium);
        return valuePremium;
    }

    public boolean isRegular(boolean valueRegular){
        isPremium(!valueRegular);
        return valueRegular;

    }

    public boolean isFasterthan(Car car){
        return this.compareTo(car)>0;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
}
