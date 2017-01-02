package lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Created by root on 1/1/17.
 */
public class MethodReferenceExample2 {

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
        System.out.println("Printing all people");
        // METHOD REFERENCE - INSTANCE_NAME:METHOD_NAME
        // p -> System.out.println(p) System is static reference, out is the instance, so println is instance metho
        // p -> System.out.println(p)   SAME AS System.out::println
        // p -> method(p)
        performConditionally(people, p->true, System.out::println);

        //print all with First name starts with A
        System.out.println("Printing all people with First name starts with A");
        performConditionally(people, p-> p.getFirstName().startsWith("A"), System.out::println); // p -> method_name(p)

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
