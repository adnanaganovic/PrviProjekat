package eight.Collection;

import seven.human.Gender;

import java.util.Objects;

public class PersonL implements Comparable<PersonL> {

    private String name;
    private String surname;
    private int age;
    private Gender gender;


    public PersonL(String name, String surname, int age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

//    @Override
//    public String toString() {
//        return "PersonL{" +
//                "name='" + name + '\'' +
//                ", surname='" + surname + '\'' +        //Ovaj Override je automatski InteliJ izbacio pri tipkanju "toString"
//                ", age=" + age +
//                ", gender=" + gender +
//                '}';

    @Override
    public String toString() {
        return name + " " + surname + ", age=" + age + ", gender=" + gender;    //Može i ovako jednostavniji pristup
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;          // ovo sve mi je IntelliJ ponudio automatski
        PersonL personL = (PersonL) o;
        return age == personL.age && Objects.equals(name, personL.name) && Objects.equals(surname, personL.surname) && gender == personL.gender;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, age, gender);                 //Josh Bloch kaže OVERRIDE hasCode i equals zajedno
    }

    @Override
    public int compareTo(PersonL o) {                    // Compare to metodu zahtjeva implementacija Comparable interfejsa
        if (age < o.getAge()) {
            return -1;
        }
        if (age > o.getAge()) {
            return 1;
        }
        return 0;
    }
}

