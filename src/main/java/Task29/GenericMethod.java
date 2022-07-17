package Task29;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collectors;

public class GenericMethod<T> {

    public <T> double partof(T[] tablica, T object){
        int all = tablica.length;
        int filter = Arrays.stream(tablica)
                .filter(element -> element.equals(object))
                .collect(Collectors.toList())
                .size();
        System.out.println(filter);
        System.out.println(all);
        return (double) filter/all*100;
    }
}
