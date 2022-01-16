public class Fibonacci2ElectricBoogaloo {
    private static int FIB_SIZE = 46;

    public static void main(String[] args) {
        //int FIB_SIZE = 46;
        System.out.println(fibIter(FIB_SIZE));

    }

    public static int fibIter(int num) {
        // Print out all the fibonacci numbers up to the given number
        if (num
                == 1
                | num
                        == 2) {
            return 1;
        } else {
            int f1 = 1;
            int f2 = 1;
            for (int i = 3; i
                    <= num; i++) {
                int temp = f2;
                f2 += f1;
                f1 = temp;
            }
            return f2;
        }
    }
}
