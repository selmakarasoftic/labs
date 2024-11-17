package src.main.java.org.example.week1;
import java.util.Scanner;
public class task5 {
    public static void main(String[] args) {
        int number;
        boolean test=true;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number: ");
        number = input.nextInt();
        if (number<0) test=false;
        if (test) System.out.println("positive");
        else System.out.println("negative");

    }
}
