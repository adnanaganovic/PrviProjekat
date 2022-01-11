package seven.animal;

public class Bird extends Animal implements Flyable {
    @Override
    public void flyable() {
        System.out.println("Ja sam ptica i ja letim");
    }
}
