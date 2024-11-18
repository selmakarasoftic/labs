package src.main.java.org.example.week6.Generics;
import java.util.*;

public class ReverseList {

    public static <T> List <T> reverseList(List < T > originalList) {
        List < T > reversedList = new ArrayList < > (originalList);
    /*
        for (int i = originalList.size() - 1; i >= 0; i--) {
            reversedList.add(originalList.get(i));
        }
    */
        Collections.reverse(reversedList);
        return reversedList;
    }
}