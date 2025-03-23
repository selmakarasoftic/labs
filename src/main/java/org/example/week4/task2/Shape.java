package src.main.java.org.example.week4.task2;

public class Shape {
    public String color;
    public FillType fillType;
    public Shape(String color,  FillType fillType) {
        this.color = color;
        this.fillType = fillType;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public FillType getFillType() {
        return fillType;
    }
    public void setFillType(FillType fillType) {
        this.fillType = fillType;
    }
    public void displayInfo(){
        String filled="yes";
        if (fillType.equals(FillType.NOT_FILLED)) filled = "no";
        System.out.println("Color: " + color + " Filled: " + filled);
    }
}
