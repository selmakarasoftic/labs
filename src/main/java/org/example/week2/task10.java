package src.main.java.org.example.week2;

import java.util.Scanner;
import java.lang.Math;
public class task10 {
    public static void main(String[] args) {
        int guessNumber;
        int NumberToGuess= (int)(Math.random()*101);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter guess number: ");
        guessNumber = input.nextInt();
        int counter=0;
        while(true) {
            if (guessNumber == NumberToGuess) {
                counter++;
                System.out.println("You guessed correctly! Number of guesses: " + counter);
                break;
            }
            else if (guessNumber > NumberToGuess) {
                counter++;
            System.out.println("Lower! Guesses: " + counter);
            }
            else {
                counter++;
                System.out.println("Upper! Guesses: " + counter);
            }
            System.out.print("Enter guess number: ");
            guessNumber = input.nextInt();
        }
    }
}
