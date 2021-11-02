import java.util.Scanner;

public class NameAndAge {
    public static void main(String[] args) {
        final int MAX_INPUTS = 10;
        String[] names = new String[MAX_INPUTS];
        int[] age = new int[MAX_INPUTS];

        String inputString = "";
        int input = 0;
        int count = 0;

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
    }
}
