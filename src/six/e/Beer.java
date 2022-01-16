package six.e;

public class Beer extends Beverage {
    public Beer() {
        super ("Pivo");
    }

    @Override
    public double cost() {
        return 4.0;
    }

    @Override
    public void drink() {
        System.out.println("Pivo se pije hladno");
    }
}

