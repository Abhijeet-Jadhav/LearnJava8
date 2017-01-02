package lambda;

/**
 * Created by root on 1/1/17.
 */
public class MethodReferenceExample {

    public static void main(String args[]){

        // printMessage in separate thread

        /*Thread t = new Thread( () -> printMessage());
        t.start();*/

        // A shorter way to write the above code
        // () -> printMessage()   this lambda is taking an argument and executing a method
        // classname::method_name where class is the one where the method resides

        Thread t = new Thread( MethodReferenceExample::printMessage);
        t.start();
    }

    public static void printMessage(){
        System.out.println("hello method references");
    }
}
