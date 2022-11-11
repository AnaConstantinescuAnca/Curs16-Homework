package Homework;

public class Main {
    public static void main(String[] args) {

        //  - list all the persons names: firstName lastName
        System.out.println(PersonService.allPersons);

        //- list all persons that are major
        System.out.println(PersonService.allMajor);

        //- list all persons from Oradea
        System.out.println(PersonService.allFromOradea);

        //- list all persons from Oradea OR Cluj
        System.out.println(PersonService.allFromOradeaOrCluj);

        //- list all firstNames CAPITALIZED
        System.out.println(PersonService.printFirstNamesCapitalized(s -> s.toUpperCase()));

        //- list all person names: firstName firstletter from last name: Stefan B.
        System.out.println(PersonService.firstNameFirstLetterOfLastName);

        //- list all persons with 18 < age < 60
        System.out.println(PersonService.allPersonOlder18Younger60);

        //- list all persons having first name starting with A
        System.out.println(PersonService.allPersonFirstNameStartingWithA);

        //- list all first names UNIQUELY
        System.out.println(PersonService.uniqueFirstName);

        //- sort the persons by first name
        System.out.println(PersonService.sortPersonByFirstName);

        //- sort the persons by last name
        System.out.println(PersonService.sortPersonByLastName);

     //- sort the persons by first name, last name and then age
        System.out.println(PersonService.sortByFirstLastNameAndAge);
    }
}
