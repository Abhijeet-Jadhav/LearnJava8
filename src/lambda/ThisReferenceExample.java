package lambda;

/**
 * Created by root on 1/1/17.
 */
// This example demonstrates the difference between anonymous inner class and lambda expressions
//  ans shows that Lambdas are not syntatic sugar for anonymous inner class
public class ThisReferenceExample {

    public void doProcess(int i, Process p){
        p.process(i);
    }

    public static void main(String args[]){
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

        /*thisReferenceExample.doProcess(3, new Process() {
            @Override
            public void process(int i) {
                System.out.println("value of i "+i);
                System.out.println(this);  // this REFERS TO instance of anon inner class
            };

            public String toString(){
               return  ("Anonymous inner class");
            }
        });*/

        /*thisReferenceExample.doProcess(4, p -> {
            System.out.println("value of p "+p);
            //System.out.println(this); // error this cannot be referenced from static context
        });*/

        thisReferenceExample.execute();
    }

    // instance method
    private void execute() {
        doProcess(4, p -> {
            System.out.println("value of p "+p);
            System.out.println(this); // this is refers to object on which it is called
        });
    }
}
