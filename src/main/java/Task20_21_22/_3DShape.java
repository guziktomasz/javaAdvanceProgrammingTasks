package Task20_21_22;

public abstract class _3DShape extends Shape implements Fillable {

    public abstract double calculateVolume();

    @Override
    public void fill(int amount) {
        double volume = calculateVolume();
        if (volume < amount) {
            System.out.println("Przeleje się");
        } else if (volume == amount) {
            System.out.println("Nalane pod gwizdek");
        } else {
            System.out.println("Zostało miejsce na dolewkę");
        }
    }
}
