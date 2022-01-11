package seven.human;

import seven.animal.Cat;
import seven.animal.Dog;
import seven.animal.Fish;

public class Person {
    private int id;
    private String name;
    private String surname;
    private Gender gender;
    private int age;

    private Dog dog;
    private Cat cat;
    private Fish fish;           /// da se ne bi ponavljali možemo kreirati "Apstraktnu klasu Animal"

//    private double salaryAmount;   Za platu moramo formirati posebne klase npr.Employee i Student klase
    //GENDER - dizajnirati tip podatka (ima samo 2 spola) Enum
//    private String gender;
    public Person(){
        System.out.println("Person...");
    }


    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Dog getDog() {
        return dog;
    }

    public void setDog (Dog dog) {
        this.dog = dog;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Fish getFish() {
        return fish;
    }

    public void setFish(Fish fish) {
        this.fish = fish;
    }

}
