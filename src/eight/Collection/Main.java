package eight.Collection;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


    String [] names = new String[3];
    names[0] = "Neila";
    names[1] = "Kerima";
    names[2] = "Selma";

    //Ovo smo prevazišli sa drugom klasom i private objektima i geterima i seterima

    Person person = new Person();
      person.setName ("Kerima");
      person.setSurname("Grabovica");
      person.setAge(13);

      //names, person - Sirovi složeni tipovi podataka
//        Box<Person> box = new Box<>();
//        box.setField();

        Box<String> box2 = new Box<>();       //Generički tip podatka T - kada formiraš objekat moraš i tip podatla npr.String ili Person
        box2.setField("Adnan");

        ArrayList<Person> persons = new ArrayList<>();     //Iz programskog jezika JAVA, slična klasa kao i box koji smo mi kreirali



    }
}
