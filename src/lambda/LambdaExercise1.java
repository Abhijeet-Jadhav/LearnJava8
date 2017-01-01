package lambda;

import java.util.*;

/**
 * Created by root on 1/1/17.
 */
public class LambdaExercise1 {
    public static void main(String args[]){
        List<Person> people = Arrays.asList(
            new Person("J","B", 4),
            new Person("R","C1", 4),
            new Person("D2","C2", 4),
            new Person("A","T", 4)
        );

        // step1  sort list by name
        /*Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getFirstName().compareTo(o2.getFirstName());
            }
        });*/
        // step2 create a method that prints all people  in list
        printPeople(people);
        // step3 create a method that prints people with last name beginning from C
        printPeopleLastNameC(people);
        printConditionally(people, new Condition() {
            @Override
            public boolean test(Person p) {
                return p.getLastname().startsWith("C");
            }
        });


        // **** LAMBDA WAY ***\
        System.out.println("Lambda way");
        Collections.sort(people, ( p1,  p2) -> p1.getFirstName().compareTo(p2.getFirstName()));
        printPeople(people);

        printConditionally(people, p -> p.getFirstName().startsWith("A"));



    }

    // Methods

    public static void printPeople(List<Person> people){
        for (Person p: people
             ) {
            System.out.println(p);
        }
    }

    public static void printPeopleLastNameC(List<Person> people){
        System.out.println("LAST NAME with C");
        for (Person p: people
                ) {
            if (p.getLastname().charAt(0) == 'C')
                System.out.println(p.toString());
        }
    }

    public static void printConditionally(List<Person> people, Condition condition){
        System.out.println("Conditionally Print");
        for (Person p: people
                ) {
            if (condition.test(p))
                System.out.println(p);
        }
    }
}

interface Condition{
    boolean test(Person p);
}