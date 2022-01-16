public class bitwiseChecksum {

    public static void main(String[] args) {
        byte x = 4;//0000 0100
        //0001 0000
        System.out.println(x
                << 2);

        byte y = 127;//0111 1111
        //0000 1111
        System.out.println(y
                >>> 3);
    }

}
