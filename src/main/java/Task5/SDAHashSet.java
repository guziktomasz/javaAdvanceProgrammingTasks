package Task5;
//Zaimplementuj klasę SDAHashSet , która będzie implementować logikę HashSet. W tym celu zaimplementuj obsługę metod:
//        • add
//        • remove
//        • size
//        • contains
//        • clear
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SDAHashSet extends HashSet {

    private List<String> elements = new ArrayList<>();



    @Override
    public int size() {
        System.out.println("size");
        return 5;
    }

    @Override
    public boolean contains(Object o) {
        System.out.println("contains");
        return false;
    }

    @Override
    public boolean add(Object s) {
        System.out.println("add");
        return true;
    }

    @Override
    public boolean remove(Object o) {
        System.out.println("remove");
        return false;
    }

    @Override
    public void clear() {
        System.out.println("clear");;
    }
}
