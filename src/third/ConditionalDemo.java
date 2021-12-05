package third;

import java.util.Scanner;

public class ConditionalDemo {
    public static void main(String[] args) {
        int number1 = new Scanner(System.in).nextInt();
        int number2 = new Scanner(System.in).nextInt();

        if ((number1 == 1) && (number2 == 23)) {
            System.out.println("Unio si dva broja");
        }
        if ((number1 == 1) && (number2++ == 23)) { //operatot II dvije vertikalne linije
            System.out.println("Yuhuuu");
        }
    }
}
