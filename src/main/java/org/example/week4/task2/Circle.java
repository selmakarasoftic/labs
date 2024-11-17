package src.main.java.org.example.week4.task2;

public class Circle extends Shape {
    private double radius;
    public Circle(String color, FillType fillType, double radius) {
        super(color, fillType);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea()
    {
        return (radius * radius * Math.PI);
    }
    @Override
    public void displayInfo() {
        System.out.println("Circle: Radius: " + radius);
        super.displayInfo();
        System.out.println("Area " + getArea());
        System.out.println("Circumference (with constant pi): "+ calculateCircumference());
        System.out.println("Circumference (without constant pi): "+ calculateCircumference(3.14,radius));
    }

    public double calculateCircumference(double PI, double radius) {
        return 2*PI*radius;
    }

    public double calculateCircumference() {
        return 2*Math.PI*radius;
    }

}
