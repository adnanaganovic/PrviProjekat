package four.Loop;

import javax.swing.*;

public class BreakDemo {
    public static void main(String[] args) {
        int [] nizBrojeva = {123, 14,34,55,86,155};
        String uneseniBrojText = JOptionPane.showInputDialog("Unesi cijeli broj");
        int uneseniBroj = Integer.parseInt(uneseniBrojText);
        for(int number: nizBrojeva){
            if(uneseniBroj ==  number){
                JOptionPane.showMessageDialog(null, "BINGO!!!");
                break;
            }
        }
    }
}
