import java.util.Scanner;

public class MorningAfternoonOrNight {

    public static void main(String[] args) {

        int time = 22;

        Scanner in = new Scanner(System.in);

        System.out.println("Enter a time in 24 hours as an integer between 1 and 24:");
        time = in.nextInt();

        while (time > 24 || time < 1) {
            System.out.println("Error - the time must be between 1 and 24, please re-enter:");
            time = in.nextInt();
        }

        if (time < 12 && time > 6) {
            System.out.println("Good morning :)");
        } else if (time < 22 && time > 11) {
            System.out.println("Good afternoon :)");
        } else if (time > 21 || time < 7) {
            System.out.println("Good night :)");
        }
    }
}