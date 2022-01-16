package six.e;

public class Coffee extends Beverage {

    public Coffee (String name) {
        super("Kafa");
    }

    public Coffee() {
        super("Kafa");
    }

    @Override
    public double cost() {
        return 1.5;
    }

    @Override
    public void drink() {
        System.out.println("Kafa se pije sa ćejfom");

    }
}
