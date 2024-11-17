package src.main.java.org.example.week2;
import java.util.Scanner;
import java.lang.Math;
public class task5 {
    public static void main(String[] args) {
        int power;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the power of the number: ");
        power = input.nextInt();
        int sum=0;
        for(int i =0;i<=power;i++)
        {
            sum+=(int)Math.pow(2,i);
        }
        System.out.println("Sum is:" +sum);
    }
}
