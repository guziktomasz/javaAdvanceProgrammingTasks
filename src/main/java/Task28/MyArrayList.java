package Task28;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyArrayList<E> extends ArrayList<E> {

    public MyArrayList(Collection<? extends E> c) {
        super(c);
    }

    public List<E> getEveryNthElement(int startIndex, int skip) {
        for (int i = startIndex; i < this.size(); i++) {
            if (((i-startIndex) % skip) == 0) {
                this.remove(i);
            }
        }

        return this;
    }
}
