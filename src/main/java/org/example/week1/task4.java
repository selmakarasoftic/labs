package src.main.java.org.example.week1;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        int number1;
        int number2;

        System.out.println("Enter number1: ");
        Scanner input = new Scanner(System.in);
        number1 = input.nextInt();
        System.out.println("Enter number2: ");
        number2=input.nextInt();
        System.out.println("Sum is: "+(number1+number2));

    }
}
