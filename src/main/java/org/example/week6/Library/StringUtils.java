package src.main.java.org.example.week6.Library;

public class StringUtils{
    public static boolean included(String word, String searched){
        word = word.toUpperCase();
        searched = searched.toUpperCase();
        return word.contains(searched);
    }
}
