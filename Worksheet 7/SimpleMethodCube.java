public class SimpleMethodCube {
    public static int cube(int num) {
        int result = 0;
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
