package src.main.java.org.example.week2;

import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        int rows;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number of rows: ");
        rows = input.nextInt();
        drawNumbersPiramid(rows);
    }

    public static void drawNumbersPiramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j < rows - 4 + i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}