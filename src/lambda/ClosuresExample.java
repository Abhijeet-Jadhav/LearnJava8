package lambda;

/**
 * Created by root on 1/1/17.
 */
public class ClosuresExample {

    public static void main(String args[]){

        int a = 24 ;
        int b = 6;
        doProcess(a, new Process() {
            @Override
            public void process(int i) {
                System.out.println(a);
            }
        });

        // Java 8, the JVM freezes the value of 'b' to 6
        // the frozen value of 'b' goes along with lambda expression, even if 'b' is not present in scope where is finally accessed
        // b is EFFECTIVELY FINAL in this case
        doProcess(a, i-> System.out.print(i+b));
    }

    public static void doProcess(int i, Process p){
        p.process(i);
    }
}

interface Process{
    public  void process(int i);
}
