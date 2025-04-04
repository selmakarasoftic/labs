package src.main.java.org.example.week6.Generics;
import java.util.List;
public class sumOddEven {
    public static <T extends Number> void calculateNumberSum(List<T> numbers){
        double evenSum = 0;
        double oddSum = 0;
        for (T number : numbers) {
            if (number.intValue() % 2 == 0) {
                evenSum += number.doubleValue();
            }
            else {
                oddSum += number.doubleValue();
            }
        }
        System.out.println("\nOriginal list of numbers: " + numbers);
        System.out.println("Sum of even numbers: " + evenSum);
        System.out.println("Sum of odd numbers: " + oddSum);
    }
}
