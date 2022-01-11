package seven;

import java.util.Random;

public class SeasonTester {
    public static void main(String[] args) {
//        Random random = new Random();                         /// Random se može pozvati uvijek
//        for (;;) {                                     //BESKONAČNA PETLJA
//            System.out.println("Slučajan broj = " + random.nextInt(10));  //Izbacuje random broj od 1-10
//        }

        Season season = Season.SPRING;
        //Switch konstukcija podržava "int, String i enum"
   switch (season){
       case SPRING:
           System.out.println("Proljeće");
           break;
       case SUMMER:
           System.out.println("Ljeton");
           break;
       case AUTUMN:
           System.out.println("Jesen");
           break;
       case WINTER:
           System.out.println("Zima");
           break;
    }}
}
