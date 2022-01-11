package six.e;

import six.Beverage;

public class Tea extends Beverage {
    public Tea(String name) {
        super("Čaj");
    }

    @Override
    public double cost() {
        return 2.0;
    }

    @Override
    public void drink() {
        System.out.println("Čaj se pije vruć");

    }
}
