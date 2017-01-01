package lambda;

/**
 * Created by root on 12/30/16.
 */
public class LambdaBasics {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public  static void main(String args[]){

        LambdaBasics lambdaBasics = new LambdaBasics();
        HelloWorldGreeter helloWorldGreeter = new HelloWorldGreeter();

        //lambdaBasics.greet(helloWorldGreeter);
        //String str = () -> System.out.println("Hello lambda!");

        // return type of lambda is an interface
        /*
        MyLamda myLambdaFunction = () -> System.out.print("hello world from lamda ");

        interface MyLamda {
            void foo();
        }
        */

        // for type of lambda, we just need an interface with matching a method signature with signature of the lambda.
        Greeting myLambdaFunctionGreeting = () -> System.out.print("hello world from lamda ");

        //execute lambda expression
        // by calling the interface method on it
        myLambdaFunctionGreeting.perform();


        //***** Difference between these three lines
        Greeting helloGreeting = new HelloWorldGreeter();  // LINE 1
        Greeting lambdaGreeting = () -> System.out.println("hello world from lamda "); // LINE 2

        // LINE 3
        Greeting anonInnerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Inner class hello world");
            }
        }; // inline implementation of interface using Anonymous inner class

        // diff is, in LINE2 we are implementing the interface without using the Class, we are directly implementing the function
        // LINE2 is syntatic sugar for LINE3

        helloGreeting.perform();
        lambdaGreeting.perform();
        anonInnerClassGreeting.perform();

        lambdaBasics.greet(helloWorldGreeter);
        lambdaBasics.greet(lambdaGreeting);
        lambdaBasics.greet(anonInnerClassGreeting);



    }
}
