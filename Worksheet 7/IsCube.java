public class IsCube {
    public static int cube(int num) {
        int result = 0;
        result = num
                * num;
        return result;
    }

    public static boolean isCube(int num1, int num2) {
        return num1
                == cube(num2);
    }

    public static void main(final String[] args) {
        System.out.println(isCube(4, 3));
    }
}
