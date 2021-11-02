public class Fibonacci {
    public static void main(final String[] args) {
        final int NUMBER_OF_INTEGERS = 10;
        int[] fib = new int[NUMBER_OF_INTEGERS];

        fib[0] = 1;

        fib[1] = 1;

        for (int i = 2; i
                < fib.length; i++) {
            fib[i] = (fib[i
                    - 1]
                    + fib[i
                            - 2]);
        }
        for (int i = 0; i
                < fib.length; i++) {
            System.out.println(fib[i]);
        }
    }
}
