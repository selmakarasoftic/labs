package src.main.java.org.example.week4.people;

public class Student extends Person {
    //private String name;
    //private String address;
    private int credits=0;

    public Student(String name, String address) {
        super(name, address);
    }
    public int credits() {
        return credits;
    }
    @Override
    public String toString() {
        return getName()+"\n"+getAddress()+"\n"+"credits "+credits;
    }
   public int study()
    {
        return credits++;
    }

    public static void main(String[] args) {
        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        //System.out.println("credits " + olli.credits());
        olli.study();
        System.out.println("credits "+ olli.credits());
    }
}
