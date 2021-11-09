import java.util.Scanner;

public class BoxesOfStarAndExtra {

    /* Takes the parameters of height and width and prints a box made of *'s */
    public static void box(int height, int width) {
        int counter = 0;
        for (int i = 0; i
                < height; i++) {
            while (counter
                    < width) {
                System.out.print("*");
                counter += 1;
            }
            System.out.print("\r\n");
            counter = 0;
        }
    }

    /*
     * Gets an input from the user and returns it if it is an integer which is
     * greater than 0.
     * It also takes a message parameter to specify to the user what they are
     * inputting.
     */
    public static int intInput(String message) {
        Scanner in = new Scanner(System.in);

        int input = 0;

        do {
            System.out.print(message);
            while (!in.hasNextInt()) {
                System.out.print("Please enter a number: ");
                in.next();
            }
            input = in.nextInt();
            if (input
                    == 0) {
                System.out.println("Please enter a number greater than zero");
            }
        } while (input
                <= 0);
        return input;
    }

    /* Main method to run the program */
    public static void main(String[] args) {

        String heightIn = "Enter the height: ";
        String lengthIn = "Enter the length: ";

        int height = 0;
        int length = 0;

        height = intInput(heightIn);
        length = intInput(lengthIn);
        box(height, length);
    }
}
