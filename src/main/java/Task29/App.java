package Task29;
//Zaimplementuj generyczną metodę partOf, która na podstawie tablicy dowolnego typu oraz wskazanej funkcji jako
// parametrów zwróci % elementów spełniających warunek.
//
public class App {


    public static void main(String[] args) {
        Integer[]tab = new Integer[]{1,2,3,4,5,2,2,2};
        GenericMethod<Integer> newG = new GenericMethod<>();
        double result = newG.partof(tab, 2);
        System.out.println(result+"%");
    }
}
