package eight.Collection;

import seven.human.Gender;

import java.util.*;

public class Tester {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();    //Ako prebacimo na LinkedList isto bude
        names.add("Omer");
        names.add("Omer");
        names.add("Omer");
        names.add("Neila");
        names.add("Ismar");
        names.add("Ismar");
        names.add("Ismar");
        for (String ime: names) {
            System.out.println(ime);
        }
            System.out.println("*************************");

            //MOGUĆE JE I INDEKSIRANO PRISTUPATI KOD List-e kao što je for petlja
            for (int i = 0; i< names.size(); i++){
                String element = names.get(i);
                System.out.println(element);
            }


        System.out.println("*************************");

       Collection<String> names2 = new TreeSet<>();    //Kad koristimo HashSet nestanu duplikati, ako koristimo TreeSet treba da ima ABC-edni redoslijed
        names2.add("Omer");
        names2.add("Omer");
        names2.add("Omer");
        names2.add("Neila");
        names2.add("Ismar");
        names2.add("Ismar");
        names2.add("Ismar");
//        for (String ime: names2){                              // prvi način ispisa liste java 7
//            System.out.println(ime);
//        }
//        names2.forEach(System.out::println);                  // drugi način ispisa umjesto for enhanced petlje
        names2.forEach(imena-> System.out.println(imena));      // treći način ispisa umjesto for enhanced petlje

        //NIJE MOGUĆE INDEKSIRANO PRISTUPATI KOD Set-ova
//        for (int i = 0; i< names2.size(); i++){
//            String element = names2.get(i);       //crveni se get ako nije Lista
//            System.out.println(element);

        List<PersonL> persons = new ArrayList<>();
        PersonL p1 = new PersonL("Jasna", "Ibrahimpašić", 23, Gender.FEMALE);
        persons.add(p1);
        PersonL p2 = new PersonL("Adnan", "Aganović", 33, Gender.MALE);
        persons.add(p2);
        PersonL p3 = new PersonL("Ademira", "Aganović", 37, Gender.FEMALE);
        persons.add(p3);
        PersonL p4 = new PersonL("Aria", "Aganović", 2, Gender.FEMALE);
        persons.add(p4);
        PersonL p5 = new PersonL("Refik", "Aganović", 69, Gender.MALE);
        persons.add(p5);
        PersonL p6 = new PersonL("Mubera", "Babić", 55, Gender.FEMALE);
        persons.add(p6);
        PersonL p7 = new PersonL("Ahmed", "Babić", 30, Gender.MALE);
        persons.add(p7);
for (PersonL imena: persons){                                // Ovo je to String metoda koja izbacuje haxadecimalni rezultat, potrebno je overridati ovu metodu to String u PersonList klasi
    System.out.println(imena);
}
    }
}
