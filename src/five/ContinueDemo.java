package five;

import java.util.Scanner;

public class ContinueDemo {
    public static void main(String[] args) {
        System.out.println("Unesi neki text: ");
        String text = new Scanner(System.in).nextLine();
        char[] nizSlova = text.toCharArray();
        char slovo = 'p';
        int brojacP = 0;
        for (int i  =0; i<nizSlova.length; i++) {
            char slovoNiza = nizSlova[i];
            if (slovo != slovoNiza) {
                continue;
            }                         //suprotno od break, break iskače iz petlje, continue nastavlja bez obzira na rezultat
            System.out.println("Nađoh opet p");
            brojacP++;
        }
            System.out.println("Slovo P se ponavlja " + brojacP + " puta.");
        }
    }

