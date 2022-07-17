package Task28;
//Rozszerz klasę ArrayList implementując metodę getEveryNthElement(). Metoda ta zwraca listę elementów oraz przyjmuje
// dwa parametry: indeks elementu od którego zaczyna oraz liczbę określającą co który element ma wybierać.
//Dla listy: [a, b, c, d, e, f, g] oraz parametrów: startIndex=2 i skip=3 zwróci listę [c, g]
import java.sql.Array;
import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        MyArrayList<String> newList = new MyArrayList<>(Arrays.asList("a", "b", "c", "d", "e", "f", "g"));

        System.out.println(newList);

        newList.getEveryNthElement(1,2);

        System.out.println(newList);
    }
}
