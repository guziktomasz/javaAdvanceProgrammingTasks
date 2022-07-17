package Task27;

import java.util.List;

public class Joiner<T> {

    private String separator;
    private Object element;
    private List<T> elementList;
    private String result = "";

    public Joiner(String separator, List<T> elementList) {
        this.separator = separator;
        this.elementList = elementList;
    }

    public String join(){
        for (T object:elementList) {
            result += object.toString() + separator;
        }
        return result;
    }

    @Override
    public String toString() {
        return "result=" + result;
    }
}
