package Task1;

import java.util.Comparator;

public class ComparatorZToA implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        o1 = o1.toLowerCase();
        o2 = o2.toLowerCase();
        return -o1.compareTo(o2);
    }
}
