package src.main.java.org.example.week4.task2;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle( "Red", FillType.FILLED, 2.0);
        circle.displayInfo();
        System.out.println();

        Rectangle rectangle = new Rectangle("Blue", FillType.NOT_FILLED, 2.0, 3.0);
        rectangle.displayInfo();
    }
}
