package six.e;

public class Tea extends Beverage {


    public Tea() {
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
