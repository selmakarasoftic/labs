package org.example.people;

public class Student extends Person {
    private int credits = 0;
    public Student(String name, String address) {
        super(name, address);
    }
    public void Study(){
        credits++;
    }
    public int credits() {
        return credits;
    }
    @Override
    public String toString() {
        return super.toString()+ "credits " + credits ; //why super.tostring??
    }
    public static void main(String[] args) {
        Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        //System.out.println("credits " + olli.credits());
        olli.Study();
        System.out.println("credits "+ olli.credits());
    }
}
