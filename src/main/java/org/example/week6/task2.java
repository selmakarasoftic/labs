package src.main.java.org.example.week6;

public class task2 {
    public static int indexOfSmallest(int[] array){
        int smallest = array[0];
        int index = 0;
        for(int i = 1; i < array.length; i++){
            if(array[i] < smallest){
                index = i;
                smallest = array[i];
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int[] values = {6,5,8,6,11};
        System.out.println(indexOfSmallest(values));
    }
}
