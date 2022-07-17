package Task12_13;
//Task 12
//        Stwórz klasę Manufacturer, która będzie zawierać pola: nazwa, rok założenia, kraj. Uwzględnij wszystkie
//        niezbędne metody oraz parametry konstruktora. Zaimplementuj metody hashCode() i equals() .
//
//        Stwórz klasę Car, która będzie zawierać pola: nazwa, model, cena, rok produkcji, lista producentów (Manufacturer),
//        oraz typ silnika (reprezentowany jako klasa enum, np. V12, V8, V6, S6, S4, S3). Uwzględnij wszystkie niezbędne
//        metody oraz parametry konstruktora. Zaimplementuj metody hashcode() i equals().
//
//Task 13
//        Stwórz klasę CarService, która będzie zawierać w sobie listę aut, oraz będzie realizować poniższe metody:
//
//        dodawanie aut do listy,
//        usuwanie auta z listy,
//        zwracanie listy wszystkich aut,
//        zwracanie aut z silnikiem V12,
//        zwracanie aut wyprodukowanych przed rokiem 1999,
//        zwracanie najdroższego auta,
//        zwracanie najtańszego auta,
//        zwracanie auta z co najmniej 3 producentami,
//        zwracanie listy wszystkich aut posortowanych zgodnie z przekazanym parametrem: rosnąco/malejąco,
//        sprawdzanie czy konkretne auto znajduje się na liście,
//        zwracanie listy aut wyprodukowanych przez konkretnego producenta,
//        zwracanie listy aut wyprodukowanych przez producenta z rokiem założenia <,>,<=,>=,=,!= od podanego.
public class APPCar {

    public static void main(String[] args) {

       /*List<Manufacturer> manufacturerList = new ArrayList<>();
       Manufacturer bmw = new Manufacturer("BMW", 1900, "Germany");
       manufacturerList.add(bmw);*/

        Car car1 = new Car("BMW",
                "M3",
                100000,
                2020,
                null,
                EngineEnum.V6
                );

        Car car2 = new Car("BMW",
                "X5",
                200000,
                1995,
                null,
                EngineEnum.V12
        );
        car1.addManufacturer(new Manufacturer("BMW", 1900, "Germany"));
        car2.addManufacturer(new Manufacturer("BMW", 1900, "Germany"));

        CarService carList = new CarService();
        carList.addCar(car1);
        carList.addCar(car2);

        carList.printCarList();

        //carList.removeCar(car1);

        carList.printCarList();

        System.out.println("V12: ");
        System.out.println(carList.engineV12());

        System.out.println("Before 1999: ");
        System.out.println(carList.producedBefore1999());

        System.out.println("Najdrozszy: ");
        System.out.println(carList.mostExpensiveCar());

        System.out.println("Najtańszy: ");
        System.out.println(carList.mostCheeperCar());


    }

}
