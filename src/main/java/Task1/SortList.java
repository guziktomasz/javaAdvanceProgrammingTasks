package Task1;

import java.util.ArrayList;
import java.util.List;

public class SortList {
    public static void main(String[] args) {

        List<String> listWord = new ArrayList<>();
        listWord.add("Kot");
        listWord.add("Pies");
        listWord.add("chomik");
        listWord.add("Słoń");

        System.out.println(listWord);
        listWord.sort(new ComparatorZToA());
        System.out.println(listWord);
    }
}
