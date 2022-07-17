package Task7;
//Stwórz klasę imitującą magazynek do broni. Klasa powinna mieć możliwość definiowania rozmiaru magazynka za pomocą
// konstruktora. Zaimplementuj metody:

//        loadBullet(String bullet) → dodawanie naboju do magazynka, nie pozwala załadować więcej naboi
//        niż wynosi pojemność magazynka

//        isLoaded() → zwraca informację o tym czy broń jest naładowana (przynajmniej jeden nabój) czy nie

//        shot() → jedno wywołanie wystrzeliwuje (wypisuje w konsoli wartość string) jeden - ostatni załadowany
//        nabój i przygotowuje kolejny, załadowany przed ostatnim, jeżeli nie ma więcej nabojów to wypisuje
//        w konsoli “pusty magazynek”
public class GunApp {

    public static void main(String[] args) {
        Magazine newMagazine = new Magazine(7);
        newMagazine.loadBullet("Bullet 1");
        newMagazine.loadBullet("Bullet 2");
        newMagazine.loadBullet("Bullet 3");
        newMagazine.shot();
        newMagazine.shot();
        newMagazine.loadBullet("Bullet 4");
        newMagazine.loadBullet("Bullet 5");
        newMagazine.loadBullet("Bullet 6");
        newMagazine.loadBullet("Bullet 7");
        newMagazine.loadBullet("Bullet 8");
        newMagazine.loadBullet("Bullet 9");
        newMagazine.loadBullet("Bullet 10");
        newMagazine.loadBullet("Bullet 11");
        newMagazine.loadBullet("Bullet 12");
        newMagazine.loadBullet("Bullet 13");
        newMagazine.shot();
        newMagazine.shot();
    }
}
