package src.main.java.org.example.week6;

public class task4 {
    public static void main(String[] args) {
        int[] values = {6,5,8,6,11};
        swap(values,3,2);
    }
    public static void swap(int[] values, int a, int b) {
        int temp = values[a];
        values[a] = values[b];
        values[b] = temp;
        for (int i: values){
            System.out.print(i + " ");
        }

    }
}
