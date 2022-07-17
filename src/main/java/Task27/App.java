package Task27;
//Zaprojektuj klasę Joiner, która w konstruktorze będzie przyjmowała separator (string) oraz posiadała metodę join()
// pozwalającą na podanie dowolnej ilości obiektów typu T. Metoda ta będzie zwracać stringa łącząc wszystkie przekazane
// elementy wywołując ich metodę toString() i oddzielać je separatorem.
//np. dla Integerów oraz separatora “-” będzie zwracała: 1-2-3-4…
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Integer> listInt = Arrays.asList(1,2,3,4,5);
        Joiner joiner = new Joiner("_-_", listInt);
        joiner.join();
        System.out.println(joiner);
    }

}
