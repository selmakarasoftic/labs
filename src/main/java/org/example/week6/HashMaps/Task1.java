package src.main.java.org.example.week6.HashMaps;

import java.util.HashMap;

public class Task1 {
    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<>();

        nicknames.put("matti", "mage");
        nicknames.put("mikael", "mixu");
        nicknames.put("arto", "arppa");

        String mikaelNickname = nicknames.get("mikael");

        System.out.println("Mikael's nickname: " + mikaelNickname);
    }
}
