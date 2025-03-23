package org.example.Shape;

public class Circle extends Shape {
    private double radius;

    public Circle(String color, FillType filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference(double PI, double r) {
        return 2 * PI * r;
    }
    public double calculateCircumference() {
        return calculateCircumference(Math.PI, radius);
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Radius: " + radius);
        System.out.println("Area: " + getArea());
        System.out.println("Circumference (with constant pi): "+ calculateCircumference());
    }
}
