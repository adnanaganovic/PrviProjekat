package six.Beverage;

import six.Beverage;

public class Coffee extends Beverage {

    public Coffee(String name) {
        super(name);
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
