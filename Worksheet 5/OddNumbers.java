public class OddNumbers {

  public static void main(String[] args) {
    int count = 0;
    int total = 0;
    while (count < 20) {
      if (count % 2 == 1) {
        total += count;
      }
      count += 1;
    }
    System.out.println(total);
  }
}
