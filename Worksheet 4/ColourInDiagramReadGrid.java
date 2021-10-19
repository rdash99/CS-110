import java.util.Arrays;
import java.util.List;

public class ColourInDiagramReadGrid {

    public static void main(String[] args) {
        List<String> row1 = Arrays.asList("R", "R", "Y", "G");
        List<String> row2 = Arrays.asList("R", "G", "G", "G");
        List<String> row3 = Arrays.asList("Y", "Y", "G", "G");
        List<String> row4 = Arrays.asList("Y", "G", "G", "G");

        int x = 1;
        int y = 2;
        String colour = "";

        x -= 1;

        if (y == 1) {
            colour = row1.get(x);
        } else if (y == 2) {
            colour = row2.get(x);
        } else if (y == 3) {
            colour = row3.get(x);
        } else if (y == 4) {
            colour = row4.get(x);
        }

        x += 1;

        if (colour.equals("R")) {
            System.out.println("The square is red. At row: " + y + " column: " + x);
        } else if (colour.equals("Y")) {
            System.out.println("The square is yellow. At row: " + y + " column: " + x);
        } else if (colour.equals("G")) {
            System.out.println("The square is green. At row: " + y + " column:" + x);
        }
    }
}
