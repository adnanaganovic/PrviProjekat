package four;

import javax.swing.*;

public class SwitchDemo {
    public static void main(String[] args) {
        String brojDanaText =JOptionPane.showInputDialog("Unesi broj dana u sedmici");
        int brojDana = Integer.parseInt(brojDanaText);
        String imeDana = null;
        switch (brojDana) {
            case 1:
                imeDana = "Mondag";
                break;
            case 2:
                imeDana = "Dienstag";
                break;
            case 3:
                imeDana = "Mittwoch";
                break;
            case 4:
                imeDana = "Donnerstag";
                break;
            case 5:
                imeDana = "Freitag";
                break;
            case 6:
                imeDana = "Samstag";
                break;
            case 7:
                imeDana = "Sonntag";
                break;
            default:
                System.out.println("Sedmica ima samo sedam dana");
        }

        if (imeDana != null){
            JOptionPane.showMessageDialog(null, "Tag :" + imeDana);
        //System.out.println ("Tag :" + imeDana);

    }
}}
