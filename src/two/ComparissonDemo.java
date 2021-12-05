package two;

import java.util.Scanner;

public class ComparissonDemo {
    public static void main(String[] args) {
        System.out.println("Unesi jedan broj: ");
        int broj1 = new Scanner(System.in).nextInt();

        if (broj1 == 5) {
            System.out.println("Pritisnuo si peticu i započeo igricu");

        }else{
            System.out.println("Nisi pritisnuo peticu i nisi počeo igricu");
        }




        System.out.println("Unesi jedan broj A: ");
        int brojA = new Scanner(System.in).nextInt();
        System.out.println("Unesi jedan broj A: ");
        int brojB = new Scanner(System.in).nextInt();

        if (brojA == brojB) {
            System.out.println("Pritisnuo si iste brojeve");

        }if (brojA != brojB){
            System.out.println("Nisi pritisnuo iste brojeve");
        }
    }
}
