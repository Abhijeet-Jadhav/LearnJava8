package lambda;

/**
 * Created by root on 1/1/17.
 */
public class HelloWorldGreeter implements Greeting {
    @Override
    public void perform() {
        System.out.println("Hello world ");
    }
}
