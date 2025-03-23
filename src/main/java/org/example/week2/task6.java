package src.main.java.org.example.week2;
import java.util.Scanner;
public class task6 {
    public static void main(String[] args) {
        String sentence="In the beginning there were the swamp, the hoe and Java.";
        Scanner input = new Scanner(System.in);
        int timesPrinted;
        System.out.println("Enter how many times should the sentence be printed: ");
        timesPrinted = input.nextInt();
        for(int i=0; i<timesPrinted; i++) {
            printSentence(sentence);
        }
    }
    public static void printSentence(String sentence) {
        System.out.println(sentence);
    }

}
