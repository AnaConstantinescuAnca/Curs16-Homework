package Homework;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonServiceCourse2 {
    // o alta varianta pentru a defini lista de Person
    private final List<Person> people = List.of(new Person("Ionel", "Vasilescu", 20, "Cluj"),
            new Person("Ana", "Ionescu", 25, "Cluj"),
            new Person("Andrei", "Popa", 61, "Oradea"),
            new Person("Alex", "Popescu", 40, "Bucuresti"));
    //new ArrayList<>();


    public List<Person> getPersons() {
        return people;
    }

    public PersonServiceCourse2() {
    }

    public List<String> getFullName() {

        return people.stream()
                //.map(person -> person.firstName() + "  " + person.lastName())
                .map(person -> "%s %s".formatted(person.firstName(),person.lastName()))
                .toList();

    }

    //list all persons with 18 < age < 60
    public List<Person> getPersonWithAgeBetween(int minAge, int maxAge) {
        return people.stream()
                .filter(person -> isValid(minAge, maxAge, person))
                .toList();
    }

    private static boolean isValid(int minAge, int maxAge, Person person) {
        return person.age() > minAge && person.age() < maxAge;
    }
}
