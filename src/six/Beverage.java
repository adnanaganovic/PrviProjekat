package six;

public abstract class Beverage {

    private String name;

    public Beverage (String name) {
        this.name = name;
    }

    public abstract double cost();

    public abstract void drink();





}
