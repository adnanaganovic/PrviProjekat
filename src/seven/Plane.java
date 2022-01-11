package seven;

import seven.animal.Flyable;

public class Plane implements Flyable {
    @Override
    public void flyable() {
        System.out.println("Nisam ptica ni animal, ali letim");
    }
}
