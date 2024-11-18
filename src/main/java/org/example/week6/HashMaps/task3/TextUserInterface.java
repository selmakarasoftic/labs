package src.main.java.org.example.week6.HashMaps.task3;
import java.util.*;
public class TextUserInterface {
    private Scanner scanner;
    private Dictionary dictionary;
    public TextUserInterface(Scanner reader, Dictionary dictionary){
        scanner=reader;
        this.dictionary=dictionary;
        System.out.println("Statement\n\tquit - quit the text user interface\n\ttranslate - asks a word and prints its translation\n\tadd - adds a word pair to the dictionary");
    }
    public void start(){
        while (true) {
            System.out.println("");
            System.out.print("Statement: ");
            String command = scanner.nextLine();

            if (command.equals("quit")){
                System.out.println("Cheers");
                break;
            } else {
                handleCommand(command);
            }
        }
    }
    public void handleCommand(String command){
        if (command.equals("translate")){
            System.out.print("Enter word: ");
            String word = scanner.nextLine();
            System.out.print(" Translation: "+ dictionary.translate(word));
        }
        else if (command.equals("add")){
            System.out.print("Enter word: ");
            String word = scanner.nextLine();
            System.out.print("Enter translation: ");
            String translation = scanner.nextLine();
            add(word, translation);
        }
        else {
            System.out.println("Unknown command");
        }
    }
    public void add(String word, String translation){
        dictionary.add(word, translation);
    }


}
