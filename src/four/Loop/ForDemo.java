package four.Loop;

public class ForDemo {
    public static void main(String[] args) {
//        for (; ;){
//            System.out.println("Uvijek smo u beskonačnoj petlji...");
//        }


        for (int number = 0; number<=5; number++){            // varijabla number vidljiva samo unutar vitičatih zagrada petlje, tako da može biti izvan zagrada još jedna istoimena varijabla
            System.out.println("Broj: " + number);

        }
    }
}
