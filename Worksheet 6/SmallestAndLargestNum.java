import java.util.Arrays;

public class SmallestAndLargestNum {
    public static void main(String[] args) {
        int[] numbers = { 1, 7, -3, 14, 19, 0, 2, -8, 6, 11, 3 };
        int size = numbers.length;
        Arrays.sort(numbers);
        System.out.println("The smallest number is "
                + numbers[0]);
        System.out.println("The largest number is "
                + numbers[size
                        - 1]);
    }
}
