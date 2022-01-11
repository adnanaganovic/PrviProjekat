package seven;

import seven.animal.Animal;
import seven.animal.Cat;
import seven.animal.Dog;
import seven.animal.Fish;

public class AnimalTester {
    public static void main(String[] args) {
        Animal animal = new Dog();
        AnimalTester.test(animal);
        animal = new Cat();
        AnimalTester.test(animal);
    }

    private static void test(Animal animal) {
        if (animal instanceof Dog){
            System.out.println("Pas");
        }else if (animal instanceof Cat){
            System.out.println("Mačka");
        }else if (animal instanceof Fish){
            System.out.println("Riba");
        }
    }
}
