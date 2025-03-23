package src.main.java.org.example.week6.HashMaps.task3;

import java.util.Scanner;

public class SecondMain {
    public static void main(String[] args) {
        Dictionary dictionary = new Dictionary();
        Scanner reader = new Scanner(System.in);
        TextUserInterface ui = new TextUserInterface(reader, dictionary);
        ui.start();
    }
}
