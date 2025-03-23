package src.main.java.org.example.week2;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = input.nextInt();
        int sum=number;
        while(!(number == 0))
        {
            System.out.print("Enter an integer: ");
            number = input.nextInt();
            sum+=number;
        }
        System.out.println("The sum is: " + sum);
    }
}
