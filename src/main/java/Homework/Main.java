package Homework;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //  - list all the persons names: firstName lastName
        System.out.println("Afisez numele tuturor persoanelor (firstName lastname):");
        System.out.println(PersonService.allPersons);

     System.out.println("Afisez firstName si lastName din clasa in care am definit Lista people ca fiind privata si finala:");
       PersonServiceCourse2 personServiceCourse2 = new PersonServiceCourse2();
        System.out.println(personServiceCourse2.getFullName());
        System.out.println(personServiceCourse2.getPersonWithAgeBetween(18,60));

        //- list all persons that are major
        System.out.println("Afisez toate persoanele majore:");
        System.out.println(PersonService.allMajor);

        //- list all persons from Oradea
        System.out.println("Afisez toate persoanele din Oradea:");
        System.out.println(PersonService.allFromOradea);

        //- list all persons from Oradea OR Cluj
        System.out.println("Afisez toate persoanele din Oradea sau Cluj:");
        System.out.println(PersonService.allFromOradeaOrCluj);

        //- list all firstNames CAPITALIZED
        System.out.println("Afisez toate prenumele cu majuscule:");
        System.out.println(PersonService.firstNamesCapitalized);
        //System.out.println(PersonService.printFirstNamesCapitalized(s -> s.toUpperCase()));

        //- list all person names: firstName firstletter from last name: Stefan B.
        System.out.println("Afisez toate numele persoanelor: prenume si prima litera din nume. :");
        System.out.println(PersonService.firstNameFirstLetterOfLastName);

        //- list all persons with 18 < age < 60
        System.out.println("Afisez toate persoanele cu varsta cuprinsa intre 18 si 60 ani:");
        System.out.println(PersonService.allPersonOlder18Younger60);

        //- list all persons having first name starting with A
        System.out.println("Afisez toate persoanele al caror prenume incepe cu A:");
        System.out.println(PersonService.allPersonFirstNameStartingWithA);

        //- list all first names UNIQUELY
        System.out.println("Afisez toate prenumele in mod unic:");
        System.out.println(PersonService.uniqueFirstName);

        //- sort the persons by first name
        System.out.println("Sortez toate persoanele dupa prenume:");
        System.out.println(PersonService.sortPersonByFirstName);

        //- sort the persons by last name
        System.out.println("Sortez toate persoanele dupa nume:");
        System.out.println(PersonService.sortPersonByLastName);

        //- sort the persons by first name, last name and then age
        System.out.println("Sortez toate persoanele dupa prenume, nume si varsta:");
        System.out.println(PersonService.sortByFirstLastNameAndAge);
    }
}
