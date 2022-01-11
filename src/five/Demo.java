package five;

public class Demo {
    public static void main(String[] args) {
        String name;
        int number = 23;
        number = 13;
        int[] numbers = new int[3];
        numbers[0] = 23;
        numbers[1] = 13;

        Person person =  new Person();           //Ako nema klase Person unutar paketa, ne može se kreirati Person person = new person();
          person.name = "Edin";                  //dakle prvo se kreira klasa person sa kojim tipovima podataka koje treba sadrzavati, pa onda se kreira person varijabla, tipa person..
          person.surname = "Džeko";
          person.age = 35;

        Person person2 = new Person();
        person2.name = "Kiko";
        person2.surname = "Fernandez";
        person2.age = 32;

        String ime1 = "Adnan";                          //Java bilježi isti String na jednu memorijsku lokaciju, tj. koristi isti podataka za više varijabli (PREFERIRANO)
        String ime2 = "Adnan";                         //Java bilježi isti String na jednu memorijsku lokaciju, tj. koristi isti podataka za više varijabli
        String ime3 = new String("Adnan");       //kod new kontruktora, može se pisati i ovako String, ali zauzima posebne memorijske lokacije, te ih ne prikazuje kao iste vrijednosti.
        System.out.println(ime1 == ime2);
        System.out.println(ime1 == ime3);

    }
}
