package src.main.java.org.example.week6.HashMaps.task3;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        dictionary.add("apina", "monkey");
        dictionary.add("banaani", "banana");
        dictionary.add("cembalo", "harpsichord");

        System.out.println(dictionary.translate("apina"));
        System.out.println(dictionary.translate("porkkana"));
        System.out.println(dictionary.amountOfWords());

        ArrayList<String> translations = dictionary.translationList();
        for(String translation: translations) {
            System.out.println(translation);
        }
        //Dictionary dictionary = new Dictionary();
        Scanner reader = new Scanner(System.in);
        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();
    }
}
