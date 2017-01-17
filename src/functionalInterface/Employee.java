package functionalInterface;


/**
 * Created by root on 1/17/17.
 */

public class Employee {
    String Name;
    int age;

    public Employee(String name, int age) {
        Name = name;
        this.age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
