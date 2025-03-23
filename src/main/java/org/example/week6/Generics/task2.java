package src.main.java.org.example.week6.Generics;
import java.util.*;

import static src.main.java.org.example.week6.Generics.ReverseList.reverseList;

public class task2 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3, 4, 5);
        List<String> strList = Arrays.asList("apple", "banana", "cherry");
        List<Integer> reversedIntList = reverseList(intList);
        List<String> reversedStrList = reverseList(strList);

        System.out.println("Original intList: " + intList);
        System.out.println("Reversed intList: " + reversedIntList);
        System.out.println();
        System.out.println("Original strList: " + strList);
        System.out.println("Reversed strList: " + reversedStrList);
    }
}
