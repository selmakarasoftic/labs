package src.main.java.org.example.week6;

public class task7 {
    public static void main(String[] args) {
        NightSky NightSky = new NightSky(0.5, 8, 4);
        NightSky.print();
        System.out.println("Number of stars: " + NightSky.starsInLastPrint());
        System.out.println();
        //NightSky.printLine();
    }
}
