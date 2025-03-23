package org.example.Shape;

public class Shape {
    protected String color;
    protected FillType filled;

    public Shape(String color, FillType filled) {
        this.color = color;
        this.filled = filled;
    }
    public void displayInfo(){
        System.out.println("Color: " + color);
        System.out.println("Filled: " + (filled == FillType.FILLED ? "yes" : "no"));
    }
}
