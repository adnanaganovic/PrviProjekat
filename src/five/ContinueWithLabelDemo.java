package five;

public class ContinueWithLabelDemo {
    public static void main(String[] args) {
        String recenica = "Pronađi mn nema mene ti";                      //Najtezi zadataka   //Zadaća, koliko se puta ponavlja men u "Pronađi mene nema mene men mene ti"
        String rijec = "men";
        //Nizovima
        char[] recenicaNiz = recenica.toCharArray();                       //string se ne mora konvertovati u char, može se staviti recenica.length
        char[] rijecNiz = rijec.toCharArray();
        int max = recenicaNiz.length - rijecNiz.length;
        NASA: for (int i=0; i<=max; i++){

            for (int j = 0; j< rijecNiz.length; j++){
                char slovoRecenica = recenicaNiz[i+j];
                char slovoRijec = rijecNiz[j];
                if (slovoRecenica != slovoRijec) {
                    continue NASA;
                   }
                }
            }}}



