package lambda;

import javafx.scene.SubScene;

import java.util.Arrays;
import java.util.List;

/**
 * Created by root on 1/5/17.
 */
public class CollectionIterationExample {

    public static void main(String args[]){
        List<Person> people = Arrays.asList(
                new Person("J", "B", 4),
                new Person("R", "C1", 4),
                new Person("D2", "C2", 4),
                new Person("A", "T", 4)
        );


        // external iterator
        System.out.println("Conventional for loop");
        for (int i=0; i<people.size(); i++){
            System.out.println(people.get(i));
        }

        // external iterator
        System.out.println("Enhanced for loop, for-in loop");
        for(Person p : people){
            System.out.println(p);
        }

        // Internal iterator
        // These iterators leverage multi-threading and parallelism
        System.out.println("Lambda forEach loop");
        people.forEach(p -> System.out.println(p));

        // Method reference
        System.out.println("Method reference forEach loop");
        people.forEach(System.out::println);

    }
}
