public class q11 {
    public static void main(String[] args) {
        int x = 10;
        int y = 25;

        x = x
                < y ? y
                        - x
                        : y
                                + x;
        x = y
                > x ? ++y : x++;
        System.out.println(x);
    }
}
