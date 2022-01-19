package eight.Collection;

import seven.human.Gender;

public class PersonL {

    private String name;
    private String surname;
    private int age;
    private Gender gender;

    public PersonL(String name, String surname, int age, Gender gender) {
    this.name =name;
    this.surname =surname;
    this.age =age;
    this.gender =gender;
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
//                ", surname='" + surname + '\'' +        //Ovaj Override je automatski InteliJ izbacio
//                ", age=" + age +
//                ", gender=" + gender +
//                '}';

    @Override
    public String toString() {
        return name + " " + surname + ", age=" + age + ", gender=" + gender;    //Može i ovako jednostavniji pristup
    }
}

