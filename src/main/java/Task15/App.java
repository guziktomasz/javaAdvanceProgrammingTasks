package Task15;
//Stwórz klasę enum Car ze stałymi FERRARI, PORSCHE, MERCEDES, BMW, OPEL, FIAT, TOYOTA, itp. Każdy z pojazdów
// ma własne parametry np. cena, moc, itp. Enum powinien zawierać metody boolean isPremium() oraz boolean isRegular().
// Metoda isPremium() powinna zwracać rezultat przeciwny od rezultatu wywołania metody isRegular().
//        Dodatkowo w ramach klasy enum powinna być zadeklarowana i zaimplementowana metoda boolean isFasterThan().
//        Metoda ta powinna przyjmować obiekt typu Car oraz wyświetlać informacje o tym, że wskazany pojazd jest
//        szybszy bądź nie od pojazdu przekazanego w argumencie. W tym celu skorzystaj z metody compareTo().


import Task1.SortList;

public class App {

    public static void main(String[] args) {
        System.out.println(Car.FERRARI.isFasterthan(Car.BMW));
        System.out.println(Car.MERCEDES.isPremium(false));
        //System.out.println("To jest auto %a a to auto %b", Car.MERCEDES.getPower(),
          //      Car.TOYOTA.getPrice());
    }
}
