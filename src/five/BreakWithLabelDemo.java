package five;

import javax.swing.*;

public class BreakWithLabelDemo {
    public static void main(String[] args) {

        int[][] numbers = {
                {32, 23, 13, 876},
                {12, 1076, 2000, 80},
                {765, 685, 17, 24}
        };



//        int uneseniBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj: "));
//        for (int i = 0 ; i< numbers.length ; i++) {
//            for ( int j = 0; j< numbers [i].length; j++){
//               int brojNiza = numbers [i][j];
//               if (brojNiza == uneseniBroj) {
//                   System.out.format( "Uneseni broj %s se nalazi na poziciji i=%s, j=%s", uneseniBroj, i, j);
//                   break;                                //Break će nas samo izbaciti iz unutrašnjeg niza, a ne iz cijelog (rješenje boolean if its true, break)
//               }
//            }




//        int uneseniBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj: "));
//        boolean foundIt = false;
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                int brojNiza = numbers[i][j];
//                if (brojNiza == uneseniBroj) {
//                    foundIt = true;
//                    System.out.format("Uneseni broj %s se nalazi na poziciji i=%s, j=%s", uneseniBroj, i, j);
//                    break;
//                }
//                if (foundIt) {
//                    break;                                //Varijanta završetka programa sa boolean foundIt = false, foundIt = true; if(foundIt){break};
//                }
//            }
//        }
//
//    }}


    int uneseniBroj = Integer.parseInt(JOptionPane.showInputDialog("Unesi broj: "));

        MOJA: for (int i = 0; i < numbers.length; i++) {
        for (int j = 0; j < numbers[i].length; j++) {
        int brojNiza = numbers[i][j];
        if (brojNiza == uneseniBroj) {

        System.out.format("Uneseni broj %s se nalazi na poziciji i=%s, j=%s", uneseniBroj, i, j);
        break MOJA;
        }

        }
        }

        }}




                //        int number = 23;
//        number = 13;    //Kada se ovako upiše, može, ali prethodna vrijednost "number" se trajno gubi

                //Kreiranje nizova jedan način (kada ne znamo koji su brojevi)
//        int [] numbers = new int[5];
//        numbers [0] = 23;
//        numbers[1] = 13;
//        numbers [2] = 10;
//        numbers [3] = 123;
//        numbers [4] = 1223;

                //Drugi način kreiranja nizova kada znamo koji su to brojevi
//        int [] brojevi = {23,13,0, 123, 1223};

                // BREAK DEMO ZADATAKA
//        int [] numbers = {'f', 23, 123,};                 //ako upišemo druge vrijednosti, iz manje u veću, konvertovat će se u broj
//        System.out.println(numbers[0]);
//
//            }
//        }
//    }