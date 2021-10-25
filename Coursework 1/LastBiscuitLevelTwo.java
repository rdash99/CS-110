import java.util.Scanner;

public class LastBiscuitLevelTwo {
    public static void main(String[] args) {
        int barrel1 = 6;
        int barrel2 = 8;
        int turn = 1;
        String barrel = "";
        int numberTaken = 0;
        Scanner in = new Scanner(System.in);

        // Main game loop
        while (barrel1 >= 0 && barrel2 >= 0) {
            // Print statements
            System.out.println("Biscuits Left - Barrel 1: " + barrel1);
            System.out.println("Biscuits Left - Barrel 2: " + barrel2);
            System.out.println("Player Turn: " + turn);

            // Choose a barrel
            System.out.print("Choose a barrel: barrel1 (one), barrel2 (two), or both (both), or skip turn (skip)? ");
            barrel = in.next();

            // Get the number of biscuits removed
            System.out.print("How many biscuits are you taking? ");
            numberTaken = in.nextInt();

            // Remove the correct number of biscuits from the barrels
            if (barrel.equals("both")) {
                barrel1 -= numberTaken;
                barrel2 -= numberTaken;
            } else if (barrel.equals("one")) {
                barrel1 -= numberTaken;
            } else {
                barrel2 -= numberTaken;
            }

            // Check barrel contents and update the number to zero if negative
            if (barrel1 < 0) {
                barrel1 = 0;
            } else if (barrel2 < 0) {
                barrel2 = 0;
            } else if (barrel1 < 0 && barrel2 < 0) {
                barrel1 = 0;
                barrel2 = 0;
                System.out.println("Biscuits Left - Barrel 1: " + barrel1);
                System.out.println("Biscuits Left - Barrel 2: " + barrel2);
                System.out.println("Winner is player " + turn);
                break;
            }

            // Win check
            if (barrel1 == 0 && barrel2 == 0) {
                System.out.println("Biscuits Left - Barrel 1: " + barrel1);
                System.out.println("Biscuits Left - Barrel 2: " + barrel2);
                System.out.println("Winner is player " + turn);
                break;
            }

            // Swap active player
            if (turn == 1) {
                turn = 2;
            } else {
                turn = 1;
            }
        }
    }
}
