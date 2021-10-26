import java.util.Scanner;

public class MilimetersToInches {

  public static void main(String[] args) {
    final double MM_PER_INCH = 25.4;

    Scanner in = new Scanner(System.in);

    System.out.println("Enter the number of milimeters with a decimal point:");
    double toConvert = in.nextDouble();

    double coverted = toConvert / MM_PER_INCH;

    System.out.println(coverted + " inches!");
  }
}
