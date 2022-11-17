package Homework;

import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PersonService {

    private static List<Person> personList = List.of(
            new Person("Ionel", "Popescu", 30, "Oradea"),
            new Person("Daniela", "Alexandrescu", 17, "Bucuresti"),
            new Person("Andrei", "Vasilescu", 45, "Oradea"),
            new Person("Andrei", "Dobrescu", 32, "Cluj"),
            new Person("Adriana", "Cristescu", 61, "Cluj"),
            new Person("Adriana", "Cristescu", 21, "Bihor"));

    Stream<Person> stream = personList.stream();

      static List<String> allPersons = personList.stream()
            .map(person -> person.firstName() + " " + person.lastName())
              //.map(person -> "s% s%".formatted(person.firstName(), person.lastName()))

              .toList();



    static List<Person> allMajor = personList.stream()
            .filter(person -> person.age()>18)
            .toList();

    static List<Person> allFromOradea = personList.stream()
            .filter(person -> person.city().equals("Oradea"))
            .toList();

    static List<Person> allFromOradeaOrCluj = personList.stream()
            .filter(person -> person.city().equals("Oradea") || person.city().equals("Cluj"))
            .toList();


    static List<String> firstNamesCapitalized = personList.stream()
            .map(person -> person.firstName().toUpperCase())
            //.map(Person::firstName)
            .toList();


    static List<String> firstNameFirstLetterOfLastName = personList.stream()
            .map(person -> person.firstName() + " " + person.lastName().substring(0,1) + ".")
            .toList();

    static List<Person> allPersonOlder18Younger60 = personList.stream()
            .filter(person -> person.age()>18 && person.age()<60)
            .toList();


    static List<Person> allPersonFirstNameStartingWithA = personList.stream()
            .filter(person -> person.firstName().startsWith("A"))
            .toList();


    static List<String> uniqueFirstName = personList.stream()
            .map(person -> person.firstName())
            .distinct()
            //.toList();
            .collect(Collectors.toList());

    static List<Person> sortPersonByFirstName = personList.stream()
            .sorted(Comparator.comparing(Person::firstName))
            .collect(Collectors.toList());

    static List<Person> sortPersonByLastName = personList.stream()
            .sorted(Comparator.comparing(Person::lastName))
            .collect(Collectors.toList());


    static List<Person> sortByFirstLastNameAndAge = personList.stream()
            .sorted(Comparator.comparing(Person::firstName).thenComparing(Person::lastName).thenComparingInt(Person::age))
            .collect(Collectors.toList());

}

