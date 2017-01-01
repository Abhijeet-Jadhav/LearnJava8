package lambda;

/**
 * Created by root on 1/1/17.
 */
public class RunnableExample {
    public static void main(String args[]){

        // spawn a new thread and run this code System.out.println("Printed inside Runnable ");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Printed inside Runnable ");
            }
        });
        thread.run();

        Thread myThread = new Thread( () -> System.out.println("printed inside Thread using Lambda"));
        myThread.run();

        // Since Runnable has a single method, we can eliminate anonymous inner class and use Lambda instead
        Runnable myLambdaThread = () -> System.out.println("printed inside Lambda");
        myLambdaThread.run();
    }
}
