package eight.Collection;

import seven.human.Gender;

import java.time.LocalDate;
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

        System.out.println("************************");

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
        persons.add(p7);
for (PersonL imena: persons){                                // Ovo je to String metoda koja izbacuje haxadecimalni rezultat, potrebno je overridati ovu metodu to String u PersonL klasi
    System.out.println(imena);
}

        System.out.println("***********************");


        Set<PersonL> persons2 = new LinkedHashSet<>();
        PersonL p21 = new PersonL("Jasna", "Ibrahimpašić", 23, Gender.FEMALE);
        persons2.add(p21);
        PersonL p22 = new PersonL("Adnan", "Aganović", 33, Gender.MALE);
        persons2.add(p22);
        PersonL p23 = new PersonL("Ademira", "Aganović", 37, Gender.FEMALE);
        persons2.add(p23);
        PersonL p24 = new PersonL("Aria", "Aganović", 2, Gender.FEMALE);
        persons2.add(p24);
        PersonL p25 = new PersonL("Refik", "Aganović", 69, Gender.MALE);
        persons2.add(p25);
        PersonL p26 = new PersonL("Mubera", "Babić", 55, Gender.FEMALE);
        persons2.add(p26);
        PersonL p27 = new PersonL("Haris", "Aganović", 28, Gender.MALE);
        persons2.add(p27);
        PersonL p28 = new PersonL("Ahmed", "Babić", 30, Gender.MALE);
        persons2.add(p28);
        persons2.add(p28);                                                                               //Ova tri dodana objekta imaju isti hashcode
        persons2.add(p28);
        persons2.add(new PersonL("Ahmed", "Babić", 30, Gender.MALE));                 // a ovaj kreirani u letu ima drugačiji hashcode iako se radi o istom objektu, ali na drugoj memorijskoj lokaciji
        for (PersonL imena: persons2){                                                                // HashSet izbacuje duplikate sa istim hash kodom (adresom hasha)
            System.out.println(imena);
        }

        System.out.println("**********************************");

        Set<PersonL> persons3 = new TreeSet<>();                                                        //TreeSet da bi funkcionisao zahtjeva comparable objekat (clasu), pa je
        PersonL p31 = new PersonL("Jasna", "Ibrahimpašić", 33, Gender.FEMALE);       // potrebno dodati u klasu PersonL implements comparable<PersonL>
        persons3.add(p31);
        PersonL p32 = new PersonL("Adnan", "Aganović", 33, Gender.MALE);              // comparable interfejs ima metodu compare to koja se mora implementirati
        persons3.add(p32);
        PersonL p33 = new PersonL("Ademira", "Aganović", 37, Gender.FEMALE);         //compareTo metoda mu je osnov da izbaci duplikate
        persons3.add(p33);
        PersonL p34 = new PersonL("Aria", "Aganović", 2, Gender.FEMALE);             //ako smo compareTo sortirali po godinama, samo će jedan objekat sa istim godinama prikazati
        persons3.add(p34);
        PersonL p35 = new PersonL("Refik", "Aganović", 69, Gender.MALE);
        persons3.add(p35);
        PersonL p36 = new PersonL("Mubera", "Babić", 55, Gender.FEMALE);
        persons3.add(p36);
        PersonL p37 = new PersonL("Haris", "Aganović", 28, Gender.MALE);
        persons3.add(p37);
        PersonL p38 = new PersonL("Ahmed", "Babić", 30, Gender.MALE);
        persons3.add(p38);
        persons3.add(p38);                                                                               //Ova tri dodana objekta imaju isti hashcode
        persons3.add(p38);
        persons3.add(new PersonL("Ahmed", "Babić", 30, Gender.MALE));                 // a ovaj kreirani u letu ima drugačiji hashcode iako se radi o istom objektu, ali na drugoj memorijskoj lokaciji
        for (PersonL imena: persons3){                                                                // HashSet izbacuje duplikate sa istim hash kodom (adresom hasha)
            System.out.println(imena);
        }

    }
}

//
//    public int getAge() {
//        LocalDate now = LocalDate.now();
//        int age = birthday.until(now).getYears();        //Računanje rođendana
//        return age;
