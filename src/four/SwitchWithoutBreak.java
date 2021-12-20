package four;

import java.util.Scanner;

public class SwitchWithoutBreak {
    public static void main(String[] args) {
        System.out.println("Unesi broj dana u sedmici");
        int brojDana = new Scanner(System.in).nextInt();
        switch (brojDana) {
            case 1:
                System.out.println("Monday");
                //     break;
            case 2:
                System.out.println("Tuesday");
                //     break;
            case 3:
                System.out.println("Wedensday");
                //     break;
            case 4:
                System.out.println("Thursday");
                //     break;
            case 5:
                System.out.println("F4riday");
           //     break;
            default:
                System.out.println("Nema tog dana ili je neradni");

        }
    }
}
