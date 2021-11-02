import java.util.ArrayList;
import java.util.Scanner;

public class NameAndAgeArrayList {
    public static void main(String[] args) {
        final int MAX_INPUTS = 10;

        // New ArrayLists
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Integer> age = new ArrayList<Integer>();

        String inputString = "";
        int input = 0;
        int count = 0;

        Scanner in = new Scanner(System.in);

        // Main loop
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

            // Input checking
            if (!inputString.equals("done")) {
                System.out.print("Please enter an age: ");
                while (!in.hasNextInt()) {
                    System.out.print("Please enter a number: ");
                    in.next();
                }
                input = in.nextInt();

                names.add(inputString);
                age.add(input);

                count += 1;
            }

        }

        // Print out names and ages
        for (int i = 0; i
                < count; i++) {
            System.out.println("Name: "
                    + names.get(i)
                    + ", age: "
                    + age.get(i));
        }
    }
}
