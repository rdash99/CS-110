import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {
        final int MAX_INPUTS = 10;
        String[] names = new String[MAX_INPUTS];
        int[] age = new int[MAX_INPUTS];

        String inputString = "";
        int input = 0;
        int count = 0;
        int smallest = 100;
        int largest = 0;
        int smallestIndex = 0;
        int largestIndex = 0;

        Scanner in = new Scanner(System.in);
        while (!inputString.equals("done")
                && count
                        < MAX_INPUTS) {

            System.out.print("Enter a name: ");

            while (!in.hasNextLine()) {
                System.out.println("Please enter a string: ");
                in.next();
            }

            inputString = in.next();
            inputString.toLowerCase();

            if (!inputString.equals("done")) {
                System.out.print("Please enter an age: ");
                while (!in.hasNextInt()) {
                    System.out.print("Please enter a number: ");
                    in.next();
                }
                input = in.nextInt();

                names[count] = inputString;
                age[count] = input;
                if (input
                        < smallest) {
                    smallest = input;
                    smallestIndex = count;
                }
                if (input
                        > largest) {
                    largest = input;
                    largestIndex = count;
                }

                count += 1;
            }

        }
        for (int i = 0; i
                < count; i++) {
            System.out.println("Name: "
                    + names[i]
                    + ", age: "
                    + age[i]);
        }
        System.out.println("The youngest person is: "
                + names[smallestIndex]
                + " with an age of "
                + age[smallestIndex]);
        System.out.println("The oldest person is: "
                + names[largestIndex]
                + " with an age of "
                + age[largestIndex]);
    }
}
