package Task3;

//Stwórz metodę, która jako parametr przyjmuje mapę, gdzie kluczem jest string, a wartością liczba, a następnie wypisuje każdy element mapy do konsoli w formacie: Klucz: "", Wartość: "". Na końcu każdego wiersza poza ostatnim, powinien być przecinek, a w ostatnim kropka.
//        Przykład:
//        Klucz: Java, Wartość: 18,
//        Klucz: Python, Wartość: 1,
//        …
//        Klucz: PHP, Wartość: 0.

import java.util.HashMap;
import java.util.Map;

public class MapTask {
    public static void main(String[] args) {
        Map<String, Integer> mapStrInt = new HashMap<>();
        mapStrInt.put("Jacek", 43);
        mapStrInt.put("Tomek", 35);
        mapStrInt.put("Damian", 55);
        mapStrInt.put("Wojtek", 25);



        printMap(mapStrInt);
    }

    public static void printMap (Map<String, Integer> mapStrInt) {
        //System.out.println(mapStrInt.size());
        int i = 1;
        for (Map.Entry<String, Integer> element: mapStrInt.entrySet()) {
            System.out.print("Klucz: " + element.getKey() + ", Wartość: " + element.getValue());
            if (mapStrInt.size() == i) {
                System.out.print(".");
            } else {
                System.out.println(",");
            }
            i++;
        }



    }
}
