package src.main.java.org.example.week6;

public class task6 {
    public static void main(String[] args) {
            int[] values = {6,5,8,6,11};
            printElegantly(values);
    }
    public static void printElegantly(int[] values){
        for (int i=0; i < values.length ; i++ ) {
            if (i==values.length-1) {
                System.out.println(values[i]);
            } else {
                System.out.print(values[i]+", ");
            }
        }
    }
}
