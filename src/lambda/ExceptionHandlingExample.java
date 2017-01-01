package lambda;

import java.util.function.BiConsumer;

/**
 * Created by root on 1/1/17.
 */
public class ExceptionHandlingExample {

    public static void main(String ar[]){

        int[] someNums = {2, 3, 4, 5,};
        process(someNums, 0, wrapperLambda((p, key) -> System.out.println(p/key)));

    }

    // 1st way - Handle exception at method

    /*private static void process(int[] somInts, int key, BiConsumer<Integer, Integer> consumer){
        for(int i : somInts)
            try {
                consumer.accept(i, key);
            } catch (ArithmeticException e){
                System.out.print("arithmetic exception");
            }

    }*/

    // 2nd way -- Handle excpetion at lambda and keep the process method simple

    /**
     process(someNums, 0, (p, key) -> {
     try{
     System.out.println(p/key);
     } catch (ArithmeticException e){
     System.out.println("arithmetic exception");
     }
     } );
     */

    private static void process(int[] somInts, int key, BiConsumer<Integer, Integer> consumer){
        for(int i : somInts)
            consumer.accept(i, key);
    }


    // third way --- externalize the exception handling
    // wrap lambda into another
    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> consumer){
        return (k,v) -> {
            try {
                consumer.accept(k,v);
            } catch (ArithmeticException e){
                System.out.println("WRAPPER Lambda - arithmetic exception");
            }
        };
    }
}
