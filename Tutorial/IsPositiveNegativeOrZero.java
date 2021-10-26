import java.util.Scanner;

public class IsPositiveNegativeOrZero {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a whole number:");
    int number = in.nextInt();

    if (number == 0) {
      System.out.println("The number is zero.");
    }
    if (number < 0) {
      System.out.println("Number is negative.");
    }
    if (number > 0) {
      System.out.println("The number is positive.");
    }
  }
}
