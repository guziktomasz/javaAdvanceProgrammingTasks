package Task6;
//Stwórz metodę, która przyjmuje TreeMap i wypisuje w konsoli pierwszy i ostatni EntrySet.
import java.util.TreeMap;

public class TreeMapExe {

    public static void main(String[] args) {
        TreeMap<String, String> ourMap = new TreeMap<>();

        ourMap.put("Adam", "Dom");
        ourMap.put("Zenon", "Drzewo");
        ourMap.put("Jan", "Woda");
        ourMap.put("Dawid", "Pustynia");

        System.out.println(ourMap);

        firstLastElement(ourMap);
    }

    public static void firstLastElement (TreeMap<String, String> ourMap){

        System.out.println(ourMap.firstEntry());
        System.out.println(ourMap.lastEntry());
    }

}
