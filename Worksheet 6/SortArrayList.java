import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortArrayList {
    public static void main(String[] args) {
        final int END_INPUT = -99;
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int input = 0;
        int count = 0;

        while (input
                != END_INPUT) {
            System.out.print("Enter a number: ");
            while (!in.hasNextInt()) {
                System.out.print("Please enter a number: ");
                in.next();
            }
            input = in.nextInt();

            if (input
                    != END_INPUT) {
                nums.add(input);
                count += 1;
            }
        }

        Collections.sort(nums);
        for (int i = 0; i
                < count; i++) {
            System.out.println(nums.get(i));
        }
    }
}
