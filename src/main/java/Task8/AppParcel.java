package Task8;
//Zaimplementuj interfejs Validator, który będzie zawierać w swojej deklaracji metodę boolean validate(Parcel input).
// Stwórz klasę Parcel z parametrami:
//        • int xLength
//        • int yLength
//        • int zLength
//        • float weight
//        • boolean isExpress
//        Validator powinien weryfikować czy suma wymiarów (x, y, z) nie przekracza 300, czy każdy z rozmiarów nie jest
//        mniejszy niż 30, czy waga nie przekracza 30.0 dla isExpress=false lub 15.0 dla isExpress=true.
//        W przypadku błędów, powinien o nich poinformować użytkownika.
public class AppParcel implements Validator {

    public static void main(String[] args) {
        Parcel input = new Parcel(50, 30, 100, 10, true);
        AppParcel newParcel = new AppParcel();
        System.out.println(newParcel.validate(input));
    }


    @Override
    public boolean validate(Parcel input) {

        boolean status = true;

        if ((input.zLength + input.xLength + input.yLength) > 300) {
            System.out.println("Suma długości wymiarów paczki przekracza 300");
            status = false;
        }

        if (input.zLength < 30) {
            System.out.println("Długość z jest krótsza niż 30");
            status = false;
        }

        if (input.xLength < 30) {
            System.out.println("Długość x jest krótsza niż 30");
            status = false;
        }

        if (input.yLength < 30) {
            System.out.println("Długość y jest krótsza niż 30");
            status = false;
        }

        if (input.isExpress == true) {
            if (input.weight > 15) {
                System.out.println("Dla Express paczka nie może być cięższa niż 15kg");
                status = false;
            }
        } else {
            if (input.weight > 30) {
                System.out.println("Dla noExpress paczka nie może być cięższa niż 30kg");
                status = false;
            }
        }
        if(status == false) {
            System.out.println("Takiej paczki nie wyślesz");
        } else {
            System.out.println("Parametry paczuchy OK, ślij paczkę w świat!");
        }
        return status;


    }
}

