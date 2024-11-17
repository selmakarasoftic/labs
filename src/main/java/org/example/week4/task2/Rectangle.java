package src.main.java.org.example.week4.task2;

public class Rectangle extends Shape{
    private double width;
    private double height;
    public Rectangle(String color, FillType fillType, double width, double height) {
        super(color, fillType);
        this.width = width;
        this.height = height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea()
    {
        return width * height;
    }
    @Override
    public void displayInfo() {
        System.out.println("Rectangle: width "+width+"\n"+"height "+height);
        super.displayInfo();
        System.out.println("Area " + getArea());
    }
}
