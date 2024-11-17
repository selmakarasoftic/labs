package src.main.java.org.example.week2;
import java.util.Scanner;
public class task1 {
    public static void main(String[] args) {
        String password="password";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter password: ");
        String password_guess=input.nextLine();
        while(!password.equals(password_guess)){
            System.out.print("Enter password: ");
            password_guess=input.nextLine();
        }
        System.out.print("Right. Secret is 'Midterms!' ");
    }
}
