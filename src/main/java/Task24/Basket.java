package Task24;

public class Basket {

    private int count = 0;

    public Basket() {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void addToBasket() throws BasketFullException {
        if (count >= 10) {
            throw new BasketFullException();
        } else {
            count--;
        }



    }

    public void removeFromBasket() throws BasketEmptyException{
        if (count < 1) {
            throw new BasketEmptyException();
        } else {
            count--;
        }
    }
}
