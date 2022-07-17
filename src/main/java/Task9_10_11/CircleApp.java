package Task9_10_11;
//Task 9
//        Stwórz klasę Point2D posiadającą pola double x, double y, gettery, settery oraz konstruktor.
//        Następnie stwórz klasę Circle, która będzie miała konstruktor: Circle(Point2D center, Point2D point)
//
//        Pierwszy parametr określa środek koła, drugi jest dowolnym punktem na okręgu. Na podstawie tych punktów,
//        klasa Circle ma określać:
//        • promień okręgu przy wywołaniu metody double getRadius()
//        • obwód okręgu przy wywołaniu metody double getPerimeter()
//        • pole okręgu przy wywołaniu metody double getArea()
//        • (trudniejsze) trzy punkty na okręgu co 90 stopni od punktu podanego przy wywołaniu metody List getSlicePoints()
//Task 10
//        Stwórz klasę MoveDirection posiadającą pola double x, double y oraz gettery, settery i konstruktor.
//        Stwórz interfejs Movable posiadający metodę move(MoveDirection moveDirection).
//        Zaimplementuj interfejs w klasach z poprzedniego zadania (Point2D oraz Circle).
//        Przy wywołaniu metody move(MoveDirection moveDirection), obiekty mają zmienić swoje położenie
//        na podstawie przekazanego kierunku (MoveDirection).
//        Sprawdź poprawność przesunięcia wywołując pozostałe metody klasy Circle.
//Task 11
//        Stwórz interfejs Resizable posiadający metodę resize(double resizeFactor).
//        Zaimplementuj interfejs w klasie z poprzedniego zadania (Circle). Przy wywołaniu metody resize(doubleresizeFactor),
//        okrąg ma zmienić swoje rozmiary o zadany współczynnik (1.5, 0.5, 10.0, itp).
//        Sprawdź poprawność zmiany rozmiaru wywołując pozostałe metody klasy Circle.

public class CircleApp {
    public static void main(String[] args) {

        Point2D center = new Point2D(5,4);
        Point2D point = new Point2D(5,10);
        Circle newCircle = new Circle(center, point);

        System.out.print("Promień: ");
        System.out.println(newCircle.getRadius());
        System.out.print("Obwód: ");
        System.out.println(newCircle.getPerimetr());
        System.out.print("Pole: ");
        System.out.println(newCircle.getArea());

        System.out.println("Przed przesunięciem");
        System.out.println(newCircle);
        newCircle.move(new MoveDirection(2, 3));
        System.out.println("Po przesunięciu");
        System.out.println(newCircle);

        System.out.println("Zwiększamy okrąg");
        newCircle.resize(2);
        System.out.println(newCircle);
        System.out.print("Promień: ");
        System.out.println(newCircle.getRadius());
        System.out.print("Obwód: ");
        System.out.println(newCircle.getPerimetr());
        System.out.print("Pole: ");
        System.out.println(newCircle.getArea());
    }
}
