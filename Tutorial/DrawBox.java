public class DrawBox {

  public static void main(String[] args) {
    final String ROW1 = "+-+-+";
    final String ROW2 = "| | |";

    int counter = 0;
    while (counter < 2) {
      System.out.println(ROW1);
      System.out.println(ROW2);
      counter++;
    }
    System.out.println(ROW1);
  }
}
