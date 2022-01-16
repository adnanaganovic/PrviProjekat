package six.e;

public abstract class Beverage {

    private String name;

    public Beverage (String name) {
        this.name = name;
    }

    public abstract double cost();

    public abstract void drink();

    public String getName(){return name;}





}
