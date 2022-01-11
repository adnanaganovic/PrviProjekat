package seven.human;

public class Student extends Person {
//    private int id;
//    private String name;
//    private String surname;
//    private Gender gender;               /// Ako navedemo u klasi da extends klasu person, ne moramo ponavljati zajedničke podatke!!! NASLJEĐIVANJE
//    private int age;                      // onda samo dopišemo podatke koji su svojstveni za tu klasu profesora
    private int indexId;

    public Student(){
        super();
        System.out.println("Student...");
    }

    public int getIndexId() {
        return indexId;
    }

    public void setIndexId(int indexId) {
        this.indexId = indexId;
    }
}
