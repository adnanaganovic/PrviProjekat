package nine;

import seven.human.Gender;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

public class Person implements Comparable<Person> {                   //implements Comparable mora imati funkciju u tijelu compareTo
    private long id;
    private String name;
    private String surname;
    private Gender gender;
    private int age;                               //Umjesto ovog pravimo LocalDate
    private LocalDate birthday;

    public Person() {                              //Možemo Kreirati dva konstruktora ako imaju različit broj parametara
    }                                              // Alt+insert -> Constructor i selektujemo parametre


    public Person(long id, String name, String surname, Gender gender, LocalDate birthday) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.birthday = birthday;
    }

    //Getters and Setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAge() {
LocalDate now = LocalDate.now();
Period perid = birthday.until(now);         // Podešavanje Age preko LocalDate, uz dodavanje variable, gettera i settera
        int age = perid.getYears();
        return age;
    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }


    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return ("ID:" + id +
                ", Ime i prezime: " + name +
                " " + surname +
                ", Spol: " + gender +
                ", rođen/a: " + birthday
               );
    }

    @Override
    public boolean equals(Object o) {          //prima objekat, mogu se porediti Animal i Person, ali treba da vrati false
        if (!(o instanceof Person)) {
            return false;                       //Kod equals funkcije se neuzimaju memorijske lokacije u obračun, već navedeni parametri za poređenje
        }
        Person comparedPerson = (Person) o;
        return id == comparedPerson.getId()                              // Kod prostih tipova "=="
                && name.equals(comparedPerson.getName())                 //kod Stringova uvijek koristimo "equals" za poređenje
                && surname.equals(comparedPerson.getSurname())
                && gender.equals(comparedPerson.getGender())
                && birthday.equals(comparedPerson.getBirthday());
    }


    @Override
    public int hashCode() {
        int hashCode = Objects.hash(id, name, surname, gender, age, birthday);
          return hashCode;
    }

    @Override
    public int compareTo(Person o) {
        int result = name.compareTo(o.getName());
        if (result==0){
            result = surname.compareTo(o.getSurname());
        }
        return result;
    }
}
