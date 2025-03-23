package src.main.java.org.example.week2;
import java.util.Scanner;
public class task7 {
    public static void main(String[] args) {
        int rows;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of rows: ");
        rows = input.nextInt();
        drawStarsPiramid(rows);
    }
    public static void drawStarsPiramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = rows-i; j < rows; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
