package seven.gui;

import java.util.ArrayList;

public class ArrayDemo {
    public static void main(String[] args) {
        String[] names = new String[3];
        names[0] = "Ajla";
        names[1] = "Selma";
        names[2] = "Kerima";

        ArrayList<String> dynamicNames = new ArrayList<>();
        dynamicNames.add("Ajla");
        dynamicNames.add("Selma");
        dynamicNames.add("Kerima");
        dynamicNames.add("Neila");

        System.out.println(names[0]);
        System.out.println(dynamicNames.get(0));

    }
}
