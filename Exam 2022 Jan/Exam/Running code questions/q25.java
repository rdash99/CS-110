public class q25 {
    public static void main(String[] args) {
        // How many of the numbers in the following list are fibonacci numbers?
        long[] posFibNumbers = { 63245976L, 17711L, 3416454622906701L, 308061521170126L, 2504730781962L, 24157824L,
                61305790721611591L, 121393L, 701408733L, 832040L, 72723460248154L, 5527939700884757L,
                37889062373143906L, 190392490709144L, 63245986L, 75025L, 75021L, 433494437L, 2971215073L,
                806515533049393L, 5527939700884745L, 196425L, 17167680177579L, 1836311901L, 365435296162L,
                117669030460993L, 165580126L, 5527939700884766L, 14472334024676221L };
        int count = 0;
        for (int i = 0; i
                < posFibNumbers.length; i++) {
            if (isFibonacci(posFibNumbers[i])) {
                count++;
            }
        }

        System.out.println(count);
    }

    private static boolean isFibonacci(long l) {
        long fib1 = 1;
        long fib2 = 1;
        long fib3 = 0;
        while (fib3
                < l) {
            fib3 = fib1
                    + fib2;
            fib1 = fib2;
            fib2 = fib3;
        }
        return fib3
                == l;
    }
}
