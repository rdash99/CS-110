import java.util.Scanner;

public class OddNumbersMax {

  /* Work out the sum of all the odd numbers between 1 and the input value. e.g 1 + 3 + 4... + value */
  public static void main(String[] args) {
    // Create scanner
    Scanner in = new Scanner(System.in);

    // Variables
    int count = 0;
    int total = 0;
    int oddSumMax = 0;

    // Enter a number
    System.out.print("Enter an odd number: ");
    oddSumMax = in.nextInt();
    while (oddSumMax % 2 == 0) {
      System.out.print("Please enter another number: ");
      oddSumMax = in.nextInt();
    }

    // Perform counting operation
    while (count <= oddSumMax) {
      if (count % 2 == 1) {
        total += count;
      }
      count += 1;
    }
    System.out.println("The total sum is: " + total);
  }
}
