package seven;

import seven.animal.Dog;
import seven.animal.Fish;
import seven.human.Employee;
import seven.human.Gender;
import seven.human.Person;
import seven.human.Proffesor;

public class Main {
    public static void main(String[] args) {

//        Person person = new Person();
//        Gender gender1 = Gender.MALE;
//        Gender gender2 = Gender.FEMALE;
//        System.out.println(gender1.hashCode());
//        System.out.println(gender2.hashCode());


        Employee employee =new Employee();
        employee.setSalaryAmount(1500);
        System.out.println(employee.getSalaryAmount());

        employee = new Proffesor();
        employee.setSalaryAmount(1500);
        System.out.println("Profesorska plata =" + employee.getSalaryAmount());

        Proffesor proffesor = new Proffesor();
        Dog dog =new Dog();
        proffesor.setDog(dog);
        Fish fish = new Fish();
        fish.setType("Šaran");
        System.out.println(fish.getType());





    }
}
