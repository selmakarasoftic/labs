package src.main.java.org.example.week2;
import java.util.Scanner;
public class task4 {
    public static void main(String[] args) {
        int topNumber;
        int bottomNumber;
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the bottom number: ");
        bottomNumber= input.nextInt();
        System.out.println("Enter the top number: ");
        topNumber= input.nextInt();
        for (int i=bottomNumber; i<=topNumber; i++) {
            System.out.print(i + " ");
        }
    }
}
