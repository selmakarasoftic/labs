package src.main.java.org.example.week4.task3;
import src.main.java.org.example.week4.people.Person;
public class task3 extends Person {
    private int age;
    private String country;
    public task3(String name, String address, int age, String country) {
        super(name, address);
        this.age = age;
        this.country = country;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }

}
