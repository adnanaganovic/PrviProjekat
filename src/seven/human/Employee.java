package seven.human;

import seven.animal.Dog;

public class Employee extends Person {
//    private int id;
//    private String name;
//    private String surname;
//    private Gender gender;           /// Ako navedemo u klasi da extends klasu person, ne moramo ponavljati zajedničke podatke!!! NASLJEĐIVANJE
//    private int age;                  // onda samo dopišemo podatke koji su svojstveni za tu klasu Employee
    private double salaryAmount;


    public Employee(){
        super();
        System.out.println("Employee...");
    }

    public double getSalaryAmount() {
        return salaryAmount;
    }

    public void setSalaryAmount(double salaryAmount) {
        this.salaryAmount = salaryAmount;
    }


}
