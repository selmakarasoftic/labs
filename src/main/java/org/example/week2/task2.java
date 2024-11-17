package src.main.java.org.example.week2;
import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        int number1;
        int number2;
        int number3;
        Scanner input = new Scanner(System.in);
            System.out.print("Enter number1: ");
            number1 = input.nextInt();
            System.out.print("Enter number2: ");
            number2 = input.nextInt();
            System.out.print("Enter number3: ");
            number3 = input.nextInt();
    System.out.print("Sum is: " + (number1+number2+number3));
    }
}
