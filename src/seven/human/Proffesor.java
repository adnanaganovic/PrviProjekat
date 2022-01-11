package seven.human;

import seven.animal.Cat;
import seven.animal.Dog;
import seven.animal.Fish;

public class Proffesor extends Employee {
//    private int id;
//    private String name;
//    private String surname;          /// Ako navedemo u klasi da extends klasu person, ne moramo ponavljati zajedničke podatke!!! NASLJEĐIVANJE
//    private Gender gender;    // onda samo dopišemo podatke koji su svojstveni za tu klasu profesora
//    private int age;
    private String university;

    public Proffesor (){
//        super();           SUPER će se svakako pozvati, ne mora se pisati, to je samo radi lakšeg razumjevanja
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    @Override
    public void setSalaryAmount(double salaryAmount) {
        super.setSalaryAmount(salaryAmount+500);
    }

//    @Override
//    public Dog getDog() {
//        return super.getDog();
//    }
//
//    @Override
//    public void setFish(Fish fish) {
//        super.setFish(fish);
//    }


}
