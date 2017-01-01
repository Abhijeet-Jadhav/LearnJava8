package lambda;

/**
 * Created by root on 1/1/17.
 */


public class Person {
    private String FirstName;
    private String Lastname;
    private int age;

    public Person(String firstName, String lastname, int age) {
        FirstName = firstName;
        Lastname = lastname;
        this.age = age;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastname() {
        return Lastname;
    }

    public int getAge() {
        return age;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "FirstName='" + FirstName + '\'' +
                ", Lastname='" + Lastname + '\'' +
                ", age=" + age +
                '}';
    }
}
