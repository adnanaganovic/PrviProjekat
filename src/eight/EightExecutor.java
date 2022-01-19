package eight;

import seven.animal.Flyable;
import seven.human.Person;

public class EightExecutor {
    public static void main(String[] args) {
        Person person = new Person();

//        // Ovo je u stilu JAVE 1.7
//        Flyable flyable = new Flyable() {
//            @Override
//            public void flyable() {
//                System.out.println("I am flying...");
//            }
//        };
//        flyable.flyable();


        //U stilu JAVE 1.8
Flyable flyable1 = () -> {                                  //LAMBDA se veze samo za funkcionalni interfejs = ne može Person person = () ->.. NE MOŽE
    System.out.println("I m flying with Java 8 style...");
};
flyable1.flyable();

    }
}
