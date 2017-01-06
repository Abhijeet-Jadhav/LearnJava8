package lambda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Created by root on 1/6/17.
 */
public class StreamsExample1 {
    public static void main(String args[]) {
        List<Person> people = Arrays.asList(
                new Person("J", "B", 4),
                new Person("R", "C1", 42),
                new Person("D2", "C2", 54),
                new Person("A", "T", 4)
        );

        people.stream()
                .filter(p -> p.getLastname().startsWith("C"))
                .filter(p -> p.getAge() > 50)
                .forEach(p -> System.out.println(p));

        // View of collection
        Stream<Person> people_stream_view = people.stream();

        // Terminal operation count()
        long count = people_stream_view.count();
        System.out.println("count = " + count);

        /*
        long countC = people_stream_view.filter(p->p.getLastname().startsWith("C")).count();
        // This will give an error java.lang.IllegalStateException: stream has already been operated upon or closed
        */

        //Returns a possibly parallel Stream with this collection as its source
        long count1 = people.parallelStream().
                            filter(p -> p.getLastname().startsWith("C"))
                            .count();
        System.out.println("count1 = " + count1);

    }
}
