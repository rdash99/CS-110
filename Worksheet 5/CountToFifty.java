import java.util.Scanner;

public class CountToFifty {

  public static void main(String[] args) {
    /* Count the number of times a user enters a number, until they enter the number 50 */
    Scanner in = new Scanner(System.in);
    int count = 0;
    int i = 0;
    while (count != 50) {
      System.out.print("Enter a number: ");
      count = in.nextInt();
      i += 1;
      System.out.println(i + " numbers entered");
    }
    System.out.println("Finished");
  }
}
