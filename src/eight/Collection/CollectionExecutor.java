package eight.Collection;

import java.util.ArrayList;

public class CollectionExecutor {
    public static void main(String[] args) {
        //svi unutar niza personArry su tip koji označimo String ili Person ili Neki drugi tip

        String[] personArray = new String[3];
        personArray[0] = "Omer";
        personArray[1]="Ismar";
        personArray[2]="Berin";
        for (String name: personArray){
            System.out.println(name);
        }

        System.out.println(".................");          //ovo ništa, samo da vidimo prelaz između dvije liste

        ArrayList<String> personArrayList = new ArrayList<>();       //ova lista ima nedefinisano polja
        personArrayList.add("Omer");
        personArrayList.add("Adnan");
        personArrayList.add("Ademira");
        personArrayList.add("Aria");
        personArrayList.add("Ime");
        for (String ime: personArrayList){
            System.out.println(ime);
        }
    }
}
