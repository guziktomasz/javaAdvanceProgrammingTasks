package Task24;
//      Stwórz klasę Basket, która imituje koszyk i przechowuje aktualną ilość elementów w koszyku. Dodaj metodę
//      addToBasket(), która dodaje element do koszyka (zwiększając aktualny stan o 1) oraz metodę removeFromBasket(),
//      która usuwa element z koszyka (zmniejszając aktualny stan o 1).
//
//      Koszyk może przechowywać od 0 do 10 elementów. W przypadku, kiedy użytkownik chce wykonać akcję usunięcia
//      przy stanie 0 lub dodania przy stanie 10, rzuć odpowiedni runtime exception (BasketFullException lub
//      BasketEmptyException).
public class App {
    public static void main(String[] args) {
        Basket basket = new Basket();

        try {
        basket.addToBasket();

        basket.removeFromBasket();

        System.out.println(basket.getCount());

        basket.removeFromBasket();

        System.out.println(basket.getCount());
        } catch (BasketEmptyException | BasketFullException e) {
            System.out.println(e.getMessage());
        }
}}
