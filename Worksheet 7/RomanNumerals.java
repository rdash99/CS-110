import java.util.Arrays;
import java.util.Scanner;

public class RomanNumerals {

    /* Convert a character to it's roman numeral value and return it */

    public static int romanNumeralToInteger(char numeral) {
        int integer = 0;
        switch (numeral) {
        case 'I':
            integer = 1;
            break;
        case 'V':
            integer = 5;
            break;
        case 'X':
            integer = 10;
            break;
        case 'L':
            integer = 50;
            break;
        case 'C':
            integer = 100;
            break;
        case 'D':
            integer = 500;
            break;
        case 'M':
            integer = 1000;
            break;
        default:
            integer = 0;
        }
        return integer;
    }

    /*
     * Convert a string of characters into their total values as roman numerals and
     * return it by calling romanNumeralToInteger() with each character.
     */
    public static int romanNumeralCalc(final String numeralSequence) {
        int total = 0;
        int length = numeralSequence.length();

        for (int i = 0; i
                < length; i++) {
            total += romanNumeralToInteger(numeralSequence.charAt(i));
        }
        return total;
    }

    /* Main method - executes the program */
    public static void main(final String[] args) {
        Scanner in = new Scanner(System.in);
        String input = "";
        System.out.print("Input a string of roman numerals: ");
        input = in.nextLine();
        input = input.toUpperCase();
        System.out.println("That equals: "
                + romanNumeralCalc(input));
    }
}
