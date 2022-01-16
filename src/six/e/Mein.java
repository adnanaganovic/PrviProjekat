package six.e;

import seven.Main;

public class Mein {
    public static void main(String[] args) {
//        Coffee coffee = new Coffee();
//        BeverageConsumer beverageConsumer = new BeverageConsumer(coffee);
//        beverageConsumer.consume();
//
//        Tea tea = new Tea();
//        BeverageConsumer beverageConsumer1 = new BeverageConsumer(tea);
//        beverageConsumer1.consume();
//
//        CocaCola cocaCola = new CocaCola();
//        BeverageConsumer beverageConsumer2 = new BeverageConsumer(cocaCola);
//        beverageConsumer2.consume();

//        Beer beer = new Beer();
//        BeverageConsumer beverageConsumer3 = new BeverageConsumer(beer);
//        beverageConsumer3.consume();
////    }

//        Beverage coffee = new Coffee();           //objekat coffe može biti tipa Beverage (naziv klase koju ekstenda klasa Coffee) ili tipa Coffee (naziv klase)
//        Beverage tea = new Tea();                 // Problem je kasnije kada se unosi npr consumeTea(tea) izbacuje grešku ako je objekat tipa "Beverage Tea = new Tea()", a kada je "Tea tea = new Tea()" nema problema
//        Beverage cocaCola = new CocaCola();
//        Beer beer = new Beer();
//
//        BeverageConsumer beverageConsumer = new BeverageConsumer(coffee);
//        beverageConsumer.consume();
//        beverageConsumer.setBeverage(tea);
//        beverageConsumer.consume();
//        beverageConsumer.setBeverage(beer);
//        beverageConsumer.consume();


        Coffee coffee = new Coffee();
        Tea tea = new Tea();
        CocaCola cocaCola = new CocaCola();
        Beer beer = new Beer();

        Mein.consumeBeverage(tea);                    //može se staviti i Mein ime klase prije poziva funkcije consume
        consumeBeverage(cocaCola);
        consumeBeverage(beer);


//        consumeTea(tea);
//        consumeCCocaCola(cocaCola);                 /// consumeTea(tea) - poziv funkcije unutar PSVM
//        consumeBeer(beer);

    }
//        private static void consumeCCocaCola( CocaCola cocaCola ){
//            System.out.println("Pijem " + cocaCola.getName() + " i košta " + cocaCola.cost()  +"KM");          // OVE 3 FUNKCIJE MOŽEMO OBJEDINITI U JEDNU FUNKCIJU ISPOD (Beverage)!!
//
//        }
//    private static void consumeTea ( Tea tea ){
//        System.out.println("Pijem " + tea.getName() + " i košta " + tea.cost()  +"KM");
//
//    }
//    private static void consumeBeer( Beer beer ){
//        System.out.println("Pijem " + beer.getName() + " i košta " + beer.cost()  +"KM");
//
//    }


    private static void consumeBeverage (Beverage beverage){
        System.out.println("Pijem " + beverage.getName() + " i to me košta " + beverage.cost());                 //1 FUNKCIJA KOJA MIJENJA 3 funkcije (consumeBeer, consumeTea, consumecocaCola)!
    }
}
