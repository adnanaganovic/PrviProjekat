package third;

import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {

        //Prosti tip podatka
        //tip - varijabla = vrijednost
        int broj1 = 23;

        //Ctr+Alt+L poravnavanje redova u Javi
        //Složeni tip podatka NIZ
        int[] brojevi = new int[3]; //za istovremeni rename istih varijabli (SHIFT + F6)
        System.out.println("Unesi prvi broj");
        brojevi[0] = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj");
        brojevi[1] = new Scanner(System.in).nextInt();
        System.out.println("Unesi treći broj");
        brojevi[2] = new Scanner(System.in).nextInt();

        System.out.println(brojevi[0] +" "+ brojevi[1] +" "+ brojevi[2]);




        //Drugi način kreiranja NIZ-a
        int [] brojevi2 = {12, 15, 23};
        char [] slova = {'d', 'e', 'f', 'f', 'e', 'n', 's', 's', 'e'};
        char [] odredisniNiz = new char[9];
//        System.out.println(slova[5]);    //pristup elemenetu niza
System.arraycopy(slova, 0, odredisniNiz,0, odredisniNiz.length);
        String text = new String(odredisniNiz);
        System.out.println(text);




    }
}
