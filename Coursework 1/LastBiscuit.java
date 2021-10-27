import java.util.Scanner;

public class LastBiscuit {

  /*
   * A program to create and run the game of last biscuit. Written by Rowan Dash
   * (2106866). SpLD marking regulations apply
   */
  public static void main(final String[] args) {
    final int BARREL_1_INITIAL = 6;
    final int BARREL_2_INITIAL = 8;
    int barrel1 = BARREL_1_INITIAL;
    int barrel2 = BARREL_2_INITIAL;
    int turn = 1;
    String barrel = "";
    int numberTaken = 0;
    boolean legal = false;
    Scanner in = new Scanner(System.in);

    // Main game loop
    while (barrel1
        >= 0
        && barrel2
            >= 0) {
      // Print statements
      System.out.println("Biscuits Left - Barrel 1: "
          + barrel1);
      System.out.println("Biscuits Left - Barrel 2: "
          + barrel2);
      System.out.println("Player Turn: "
          + turn);

      // Number legality checking loop
      while (!legal) {
        // Choose a barrel
        System.out.print("Choose a barrel: barrel1 (one), barrel2 (two), "
            + "or both (both),"
            + " or skip turn (skip)? ");
        barrel = in.next();
        barrel.toLowerCase();

        // Barrel input checks
        while (!barrel.equals("one")
            && !barrel.equals("two")
            && !barrel.equals("both")) {
          System.out.print("Choose a barrel: barrel1 (one), barrel2 (two), "
              + "or both (both), "
              + "or skip turn (skip)? ");
          barrel = in.next();
          barrel.toLowerCase();
        }

        // Get the number of biscuits to be removed
        //Check whether the input number is legal
        System.out.print("How many biscuits are you taking? ");
        while (!in.hasNextInt()) {
          System.out.print("Please input an integer: ");
          in.next();
        }
        numberTaken = in.nextInt();

        // Check if the number input is negative
        if (numberTaken
            <= 0) {
          System.out.print("Sorry, that's not a legal number of "
              + "biscuits for that/those barrel(s)\n");
          barrel = "";
        }
        // Check if there are enough biscuits in the barrel/s
        if (barrel.equals("both")) {
          if (numberTaken
              > barrel1
              && numberTaken
                  > barrel2) {
            System.out.print("Sorry, that's not a legal number of "
                + "biscuits for that/those barrel(s)\n");
          } else {
            legal = true;
          }
        } else if (barrel.equals("one")) {
          if (numberTaken
              > barrel1) {
            System.out.print("Sorry, that's not a legal number of "
                + "biscuits for that/those barrel(s)\n");
          } else {
            legal = true;
          }
        } else if (barrel.equals("two")) {
          if (numberTaken
              > barrel2) {
            System.out.print("Sorry, that's not a legal number"
                + " of biscuits for that/those barrel(s)\n");
          } else {
            legal = true;
          }
        }
      }

      // Remove the correct number of biscuits from the barrels
      if (barrel.equals("both")) {
        barrel1 -= numberTaken;
        barrel2 -= numberTaken;
      } else if (barrel.equals("one")) {
        barrel1 -= numberTaken;
      } else {
        barrel2 -= numberTaken;
      }

      // Win check
      if (barrel1
          == 0
          && barrel2
              == 0) {
        System.out.println("Biscuits Left - Barrel 1: "
            + barrel1);
        System.out.println("Biscuits Left - Barrel 2: "
            + barrel2);
        System.out.println("Winner is player "
            + turn);
        break;
      }

      // Swap active player
      if (turn
          == 1) {
        turn = 2;
      } else {
        turn = 1;
      }
      // Reset the taken number of biscuits and the chosen barrel
      //re-enable the legality check loop
      numberTaken = 0;
      barrel = "";
      legal = false;
    }
  }
}
