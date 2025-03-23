package org.example.Shape;

public class Rectangle extends Shape {
    private double width;
    private double height;

    public Rectangle(String color, FillType filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Width: " + width);
        System.out.println("Height: " + height);
        System.out.println("Area: " + getArea());

    }

    public double getArea() {
        return width*height;
    }
}
