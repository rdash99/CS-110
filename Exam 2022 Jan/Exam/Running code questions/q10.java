public class q10 {
    public static void main(String[] args) {
        String s1 = "Hello there!";
        String s2 = "Hello";
        String s3 = s1.substring(0, 5);
        System.out.println((s1
                == s3)
                + " "
                + s2.equals(s3));
    }
}
