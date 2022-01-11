package seven.gui;

import java.util.ArrayList;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Ajla";
        names[1] = "Adnan";
        names[2] = "Selma";

        ArrayList<String> dynamicNames = new ArrayList<>();
        dynamicNames.add("Ajla");
        dynamicNames.add("Adnan");
        dynamicNames.add("Selma");
        dynamicNames.add("Kerima");

        System.out.println(names[0]);
        System.out.println(dynamicNames.get(0));

    }
}
