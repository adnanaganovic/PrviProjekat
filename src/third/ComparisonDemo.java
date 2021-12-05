package third;
import java.util.Scanner;

public class ComparisonDemo {
    public static void main(String[] args) {
        System.out.println("Unesi jedan broj!");
        int number1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi cijeli broj!");
        int number2 = new Scanner(System.in).nextInt();

        if (number1 == number2) {
        System.out.println("Imao si dva jednaka broja");
    }
        if (number1 != number2) {
            System.out.println("Imao si dva različita broja");
        }
        if (number1 <= number2) {
            System.out.println("Broj 1 je manji ili jednak broju 2");
        }
        if (number1 >= number2) {
            System.out.println("Broj 1 je veći ili jednak broju 2");
        }


    }
}
