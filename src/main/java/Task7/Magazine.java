package Task7;

import java.util.ArrayList;
import java.util.List;

public class Magazine {

    int sizeOfMagazine;
    List<String> gunMagazine = new ArrayList<>();
    String bullet;

    public Magazine(int sizeOfMagazine) {
        this.sizeOfMagazine = sizeOfMagazine;
    }

    public void loadBullet(String bullet) {
        if (gunMagazine.size() >= sizeOfMagazine) {
            System.out.println("Magazynek jest pełny");
        } else {
            gunMagazine.add(bullet);
        }
    }

    public boolean isLoaded() {
        return !gunMagazine.isEmpty();
    }

    public void shot() {
        if (isLoaded()) {
            String shotString = gunMagazine.get(gunMagazine.size() - 1);
            gunMagazine.remove(gunMagazine.size() - 1);
            System.out.println(shotString);
        } else {
            System.out.println("Nie ma czym strzelać");
        }
    }


}
