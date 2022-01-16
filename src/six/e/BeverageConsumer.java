package six.e;

public class BeverageConsumer {
    private Beverage beverage;

    public BeverageConsumer(Beverage beverage){
        this.beverage = beverage;


    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    public void consume (){
        System.out.println("Konzumiram " + beverage.getName() + " i to me košta: " +beverage.cost() +"KM");
    }
}
