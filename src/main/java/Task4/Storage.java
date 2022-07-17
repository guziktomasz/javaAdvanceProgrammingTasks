package Task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Storage {

    private Map<String, List<String>> mapStorage = new HashMap<>();


    public Storage() {

    }

    public void addToStorage(String key, String value) {
        boolean isValueKey = false;
        if (mapStorage.containsKey(key)) {
            List<String> listFromStorage = mapStorage.get(key);
            listFromStorage.add(value);
            mapStorage.put(key, listFromStorage);
        } else {
            List<String> newList = new ArrayList<>();
            newList.add(value);
            mapStorage.put(key, newList);
        }
    }

    public void printValue(String key) {
        System.out.println(key + " : " + mapStorage.get(key));
    }

    public void findValues(String value) {
        for (Map.Entry<String, List<String>> element: mapStorage.entrySet()) {
            if (element.getValue().contains(value)){
                System.out.println(element.getKey());
            }
        }
    }
}
