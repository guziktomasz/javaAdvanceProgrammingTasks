package Task4;
//Stwórz klasę Storage, która będzie miała prywatne pole typu Map, publiczny konstruktor oraz metody:
//        addToStorage(String key, String value) → dodawanie elementów do przechowywalni
//        printValues(String key) → wyświetlanie wszystkich elementów pod danym kluczem
//        findValues(String value) → wyświetlanie wszystkich kluczy, które mają podaną wartość
//
//        Klasa Storage powinna pozwalać na przechowywanie wielu wartości pod jednym kluczem.
public class AppStorage {
    public static void main(String[] args) {
        Storage newStorage = new Storage();
        newStorage.addToStorage("Jabłko", "Czerwone");
        newStorage.printValue("Jabłko");
        newStorage.addToStorage("Jabłko", "Zielone");
        newStorage.printValue("Jabłko");
        newStorage.addToStorage("Ketchup", "Lagodny");
        newStorage.printValue("Ketchup");
        newStorage.addToStorage("Ketchup", "Pikantny");
        newStorage.addToStorage("Chips", "Pikantny");
        newStorage.printValue("Ketchup");
        newStorage.printValue("Chips");
        System.out.println("---------------------");
        newStorage.findValues("Pikantny");
    }
}
