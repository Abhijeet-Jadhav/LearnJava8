package lambda;

/**
 * Created by root on 1/1/17.
 */

// complier infers input type of input parameter and return type of lambda based on the type of interface
public class TypeInferenceExample {

    public static void main(String args[]){
        //StringLengthLambda myLambda = (String s) -> s.length();

        // Type String for s can be omitted, it is inferred by compiler
        StringLengthLambda myLambda = (s) -> s.length();

        //one input argument you can eliminate the paranthesis
        StringLengthLambda myLambda1 = s -> s.length();


        System.out.println(myLambda1.length("Hello world"));
        printLambda(s -> s.length());
    }

    public static void printLambda(StringLengthLambda l){
        System.out.println(l.length("Hello world !"));
    }

    interface  StringLengthLambda{
        int length(String s);
    }
}
