package six.e;

public class CocaCola extends Beverage {

    public CocaCola(String name){
        super ("Kola");
    }

    public CocaCola() {
        super("Kola");
    }

    @Override
    public double cost() {
        return 3.0;
    }


    @Override
    public void drink() {
        System.out.println("Kola se pije hladna");
    }
}
