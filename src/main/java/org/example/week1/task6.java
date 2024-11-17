package src.main.java.org.example.week1;
import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        int number1;
        int number2;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number1: ");
        number1 = input.nextInt();
        System.out.print("Enter number2: ");
        number2 = input.nextInt();
        if (number1 > number2) {
            System.out.println("The number "+number1+" is greater.");
        }
        else if (number1 < number2) {
            System.out.println("The number "+number2+" is greater.");
        }
        else {
            System.out.println("Numbers are equal.");
        }
    }
}
