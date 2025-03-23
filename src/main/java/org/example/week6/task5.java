package src.main.java.org.example.week6;
import java.util.Scanner;
import java.util.Arrays;

public class task5 {
    public static void main(String[] args) {
        int[] array = {-3, 2, 3, 4, 7, 8, 12};
        Scanner reader = new Scanner(System.in);
        System.out.println("Values of the array: " + Arrays.toString(array));
        System.out.println();
        System.out.println("Enter searched number: ");
        String searchedValue = reader.nextLine();
        System.out.println();
        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));
        if (result) {
            System.out.println("Value " + searchedValue + " is in the array");
        }
        else {
            System.out.println("Value " + searchedValue + " is not in the array");
        }
    }
    class BinarySearch {
        int[] searchArray;
        int value;
        public BinarySearch (int[] array, int value) {
            this.searchArray=array;
            this.value=value;
        }
        public static boolean search(int[] array, int value) {
            int middle=array.length/2;
            int left=array[0];
            int right=array.length-1;
            while(middle>=left&&middle<=right) {
                if (array[middle]==value) return true;
                else if (array[middle]<value) middle++;
                else middle--;
            }
            return false;


        }
    }
}
