public class Transposition {
    public static void main(String[] args) {
        // Convert a string into a 2d array of characters then read the characters in the 2d array by column with an integer key which dictates the number of columns
        // The key is the number of columns in the 2d array
        // Print the characters by column

        int key = 3;
        String input = "she may be but little but she is fierce!";
        char[][] inputArray = new char[input.length()][key];
        for (int i = 0; i
                < input.length(); i++) {
            inputArray[i][i
                    % key] = input.charAt(i);
        }
        for (int i = 0; i
                < inputArray.length; i++) {
            for (int j = 0; j
                    < inputArray[i].length; j++) {
                System.out.print(inputArray[i][j]);
            }
            System.out.println();
        }

    }
}
