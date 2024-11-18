package src.main.java.org.example.week6.HashMaps.task3;

import java.util.ArrayList;
import java.util.HashMap;

public class Dictionary {
    private HashMap<String,String> dictionary;
    public Dictionary(){
        dictionary=new HashMap<String,String>();
    }

    public void add(String finnish,String english){
        dictionary.put(finnish,english);
    }
    public String translate(String word) {
        if (dictionary.containsKey(word))
            return dictionary.get(word);
        return "Word " + word + " not found";
    }
    public String amountOfWords(){
        return "amount of words: " + dictionary.size();
    }
    public ArrayList<String> translationList(){
        ArrayList<String> translateList = new ArrayList<String>();
        for (String key : dictionary.keySet()) {
            translateList.add(key + "="+dictionary.get(key));
        }
        return translateList;
    }
}
