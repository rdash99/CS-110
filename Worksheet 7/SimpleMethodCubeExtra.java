public class SimpleMethodCubeExtra {
    public static long cube(long num) {
        long result = 0;
        result = num
                * num;
        return result;
    }

    public static void main(final String[] args) {
        System.out.println(cube(2));
        System.out.println(cube(-2));
        System.out.println(cube(0));
    }
}
