package src.main.java.org.example.week6;

public class task3 {
    public static void main(String[] args) {
        int[] values = {6,5,8,6,11};
        int index=2;
        System.out.println(indexOfSmallestStartingFrom(values,index));
    }
    public static int indexOfSmallestStartingFrom(int[] array,int starting) {
        int min = array[starting];
        int index=starting;
        for(int i = starting; i < array.length; i++){
            if(array[i] < min){
                index = i;
                min = array[i];
            }
        }
        return index;
    }
}
