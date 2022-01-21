package nine;

import seven.human.Gender;

import java.time.LocalDate;
import java.util.*;

public class Tester {
    public static void main(String[] args) {

//        Person person = new Person();
//        person.setName("Kerima");                    //Jedna opcija dobavljanja imena

//
//        LocalDate p1Birthday = LocalDate.of(1988,11,24);
//        Person p1 = new Person (241198818, "Adnan", "Aganović", Gender.MALE, p1Birthday);
//        int age = p1.getAge();
//        System.out.println("Godina :" + age);
//        System.out.println("ID: " + p1.getId() + ", Ime: " + p1.getName() +" "+ p1.getSurname() + ", Spol: " + p1.getGender() + ", Godina: " + p1.getAge());

        PersonReader personReader = new PersonReader();

//        List<Person> personList = personReader.queryOnDataBase();
//        for (Person person: personList){                                      //Ovo je za Listu
//            System.out.println(person);
//        }

//        Set<Person> personCollection = new HashSet<>(personReader.queryOnDataBase());
//        for (Person person: personCollection){                                        //Ovo je za set, da izbacimo duplikate
//            System.out.println(person);
//        }

//        Set<Person> personCollection = new TreeSet<>(personReader.queryOnDataBase());
//        for (Person person: personCollection){                                        //Ukoliko želimo ABC-edni redoslijed koristimo TreeSet<>
//            System.out.println(person);                                               // Ali u tom slučaju moramo koristiti kod Person classe -> Implements Comparable (koji mora imati funkciju compareTo)
//        }

        //VJEŽBA: Traži direktor da mu se isprintaju liste: svi uposleni, pa samo stariji od 30 godina, pa samo žene
        List<Person> personList = personReader.queryOnDataBase();
//        Tester.printPersons(personList);
//        System.out.println("OLDER THAN:");
//        printPersonsOlderThan(personList, 30);
//        System.out.println("PRINT FEMALE:");                           //pozivanje funkcija za pojedinačne metode napravljene
//        printPersonsWithGender(personList, Gender.FEMALE);
//        System.out.println("AGE OD - DO: ");
//        printPersonsWithAge(personList, 20, 30);

        printPeople(personList, (person) -> true);             //pozivanje fukncije za printPeople preko PersonTester interfejsa
        System.out.println("ŽENE: ");
        printPeople(personList, (person -> person.getGender().equals(Gender.FEMALE)));



    }                                                                 //ovdje je kraj psvm funkcije, metoda "printPersons" mora da ide psolije nje

//    private static void printPersons(List<Person> personList) {
//        for (Person person : personList) {
//            System.out.println(person);
//        }
//    }
//
//    private static void printPersonsOlderThan(List<Person> personList, int age) {
//        for (Person person : personList) {
//            if (person.getAge() >= age) {
//                System.out.println(person);
//            }
//        }
//    }
//    private static void printPersonsWithGender (List<Person> personList, Gender gender) {             //CILJ JE SVE OVE FUNKCIJE ZAMJENITI SA JEDNOM, TADA NAM TREBA FUNKCIONALNI INTERFEJS
//        for (Person person : personList) {                                                            //NAZVAN PersonTester
//            if (person.getGender().equals(gender)){
//            System.out.println(person);
//        }
//    }
//}
//    private static void printPersonsWithAge (List<Person> personList, int min, int max) {
//        for (Person person : personList) {
//            int age = person.getAge();
//            if (age >= min && age<= max){
//                System.out.println(person);
//            }
//        }
//
//        }

        private static void printPeople(List<Person> personList, PersonTester personTester){
        for (Person person: personList){
            if (personTester.test(person)){                                                     //Funkcija koja mijenja sve obe gore, za age, gender, name..
                System.out.println(person);
            }
        }
        }

//        private static <T> void procesElements (List<T> elements, Predicate<T> tester, ElementProcessor<T>){
//        for (T element: elements){
//            if (tester.test(element)){                                                                       //GENERIČKI TIPOVI
//                procesor.procesiraj(element);
//            }
//        }
//        }
}
