package Tutorial;

import java.util.Scanner;

/* A program to get the users name and then
 * Greet them nicely
 */
public class Greetings {
    public static void main(String[] args) {
        // Connect to keyboard for input
        Scanner in = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = in.nextLine();
        System.out.println("Hello " + name + "!");

    }
}
