import java.util.Scanner;

public class NestedLoopsSquare {

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    int height = 0;
    int length = 0;
    int counter = 0;

    System.out.print("Enter height: ");
    height = in.nextInt();
    System.out.print("Enter length: ");
    length = in.nextInt();

    for (int i = 0; i < height; i++) {
      while (counter < length) {
        System.out.print("*");
        counter += 1;
      }
      System.out.print("\r\n");
      counter = 0;
    }
  }
}
