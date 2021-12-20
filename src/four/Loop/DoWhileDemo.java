package four.Loop;

public class DoWhileDemo {
    public static void main(String[] args) {
        int number = 1;       // Ako stavimo 11 kod do petlje će jednom ući i neće više nikad

        do {
            System.out.println("Broj je: " + number);
            number++;
        }while (number<=10);
    }
}
