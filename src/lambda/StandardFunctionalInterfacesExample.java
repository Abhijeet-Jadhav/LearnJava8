package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by root on 1/1/17.
 */
public class StandardFunctionalInterfacesExample {

    public static void main(String args[]) {
        List<Person> people = Arrays.asList(
                new Person("J", "B", 4),
                new Person("R", "C1", 4),
                new Person("D2", "C2", 4),
                new Person("A", "T", 4)
        );

        // sort list
        Collections.sort(people, (p1, p2) -> p1.getFirstName().compareTo(p2.getFirstName()));

        // print all
        // predicate p -> true since we want to print all people
        System.out.println("Printing all people");
        performConditionally(people, p->true, p -> System.out.println(p));

        //print all with First name starts with A
        System.out.println("Printing all people with First name starts with A");
        performConditionally(people, p-> p.getFirstName().startsWith("A"), p -> System.out.println(p));

        //print all with LAST name starts with C
        System.out.println("Printing all people with First name starts with C");
        performConditionally(people, p-> p.getLastname().startsWith("C"), p -> System.out.println(p.getLastname()));

    }

    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer){
        for(Person p : people){
            if(predicate.test(p))
                consumer.accept(p);
        }
    }
}
