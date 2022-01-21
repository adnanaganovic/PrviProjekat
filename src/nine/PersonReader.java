package nine;

import seven.human.Gender;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonReader {

    public List<Person> queryOnDataBase () {
        List<Person> personList = new ArrayList<>();
        LocalDate p1Birthday = LocalDate.of(1988,11,24);
        Person p1 = new Person (241198818, "Adnan", "Aganović", Gender.MALE, p1Birthday);
        personList.add(p1);
        personList.add(p1);
        personList.add(new Person(1401020, "Aria", "Aganović", Gender.FEMALE, LocalDate.of(2020, 1,14)));
        personList.add(new Person(1401020, "Ademira", "Aganović", Gender.FEMALE, LocalDate.of(1984, 11,25)));
        personList.add(new Person(2802953, "Refik", "Aganović", Gender.MALE, LocalDate.of(1953,2,28)));
        personList.add(new Person(18086968, "Mubera", "Babić", Gender.FEMALE, LocalDate.of(1968, 8,16)));
        personList.add(new Person(2701992, "Ahmed", "Babić", Gender.MALE, LocalDate.of(1992,1,27)));
        personList.add(new Person(1605983, "Dino", "Aganović", Gender.MALE, LocalDate.of(1983,5,16)));
        personList.add(new Person(18031993, "Haris", "Aganović", Gender.MALE, LocalDate.of(1993,3,18)));
        personList.add(new Person(10081964, "Remiza", "Bajramović", Gender.FEMALE, LocalDate.of(1964, 8,10)));
        personList.add(new Person(1202953, "Redžep", "Bajramović", Gender.MALE, LocalDate.of(1958,2,12)));



        return personList;

    }
}
