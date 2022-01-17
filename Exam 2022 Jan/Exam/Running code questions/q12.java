public class q12 {
    static int i = 1;

    public static void main(String args[]) {
        System.out.print(i
                + ", ");
        m(i);
        System.out.print(i);
    }

    public static void m(int i) {
        i += 2;
    }
}
