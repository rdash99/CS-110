import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ColourInDiagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Define the grid
        List<String> row1 = Arrays.asList("R", "R", "Y", "G");
        List<String> row2 = Arrays.asList("R", "G", "G", "G");
        List<String> row3 = Arrays.asList("Y", "Y", "G", "G");
        List<String> row4 = Arrays.asList("Y", "G", "G", "G");

        // Create Variables
        int x = 1;
        int y = 2;
        String colour = "";

        // Get x and y values
        System.out.println("Enter the x coordinate:");
        x = in.nextInt();
        System.out.println("Enter the y coordinate:");
        y = in.nextInt();

        // Check x and y values
        while (y >= 4 && y <= 1 || x >= 4 && x <= 1) {
            System.out.println("Error, x and y should be values between 1 and 4, please reenter x:");
            x = in.nextInt();
            System.out.println("Please reenter y:");
            y = in.nextInt();
        }

        // Subtract 1 from x so it can be used as an index
        x -= 1;

        // Check row and get the value at x
        if (y == 1) {
            colour = row1.get(x);
        } else if (y == 2) {
            colour = row2.get(x);
        } else if (y == 3) {
            colour = row3.get(x);
        } else if (y == 4) {
            colour = row4.get(x);
        }

        // Add 1 to x so it looks nicer when printed
        x += 1;

        // Check colour and print the appropriate message
        if (colour.equals("R")) {
            System.out.println("The square is red. At row: " + y + " column: " + x);
        } else if (colour.equals("Y")) {
            System.out.println("The square is yellow. At row: " + y + " column: " + x);
        } else if (colour.equals("G")) {
            System.out.println("The square is green. At row: " + y + " column:" + x);
        }
    }
}
