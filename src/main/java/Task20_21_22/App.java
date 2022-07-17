package Task20_21_22;
//Task 20
//        Stwórz abstrakcyjną klasę Shape wraz z abstrakcyjnymi metodami calculatePerimeter() służącą do obliczania
//        obwodu oraz calculateArea() służącą do obliczania powierzchni.
//        Stwórz klasy Rectangle, Triangle, Hexagon, rozszerzając klasę Shape, odpowiednio implementując metody
//        abstrakcyjne. Sprawdź poprawność działania.
//Task 21
//        Stwórz abstrakcyjną klasę 3DShape rozszerzającą klasę Shape z poprzedniego zadania. Dodaj dodatkową metodę
//        calculateVolume().
//        Stwórz klasy Cone oraz Qube rozszerzając klasę 3DShape, odpowiednio implementując metody abstrakcyjne.
//        Sprawdź poprawność działania.
//Task 22
//        Stwórz interfejs Fillable posiadający metodę fill(). Zaimplementuj metodę w klasie 3DShape z poprzedniego zadania lub osobno w klasach Cone oraz Qube.
//        Metoda fill() powinna przyjmować parametr np. int i sprawdzać, czy po, akcja napełnienia figury:
//          • wleje za dużo wody do figury i przeleje,
//          • napełni figurę wodą po brzegi,
//          • wleje za mało wody.
//        Dla każdej sytuacji powinna zapisać informację o stanie w konsoli. Użyj metody calculateVolume().


import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        Shape shape1 = new Triangle(2, 3, 3, 2);
        Shape shape2 = new Hexagon(3);
        Shape shape3 = new Rectangle(2,3);

        List<Shape> shapes = Arrays.asList(shape1, shape2, shape3);
        shapes.forEach(shape -> System.out.printf("Pole %f, obwód %f \n", shape.calculateArea(), shape.calculatePerimetr()));

        Shape shape4 = new Cube(3);
        Shape shape5 = new Cone(2,5,3);

        shapes = Arrays.asList(shape4, shape5);
        shapes.forEach(shape -> System.out.printf("Pole: %f \n", shape.calculateArea()));

        String masg = shapes.stream()
                .filter(shape -> shape instanceof _3DShape)
                .map(shape -> (_3DShape) shape)
                .map(_3DShape -> "Objetość: " + _3DShape.calculateVolume())
                .collect(Collectors.joining(", ", " ", ".\n" ));
        System.out.println(masg);


        System.out.println("Filowanie --------------------------");
        List<_3DShape> threeDshape = Arrays.asList((_3DShape) shape4, (_3DShape) shape5);
        for (_3DShape dShape : threeDshape) {
            dShape.fill(100);
        }

    }
}
