public class q14 {
    public static void main(String[] args) {
        String[] list = { "lemon", "orange", "kiwi" };
        String prev = "none";
        for (String elt : list) {
            System.out.println("Current: "
                    + elt
                    + "; Previous: "
                    + prev);
            prev = elt;
        }
    }
}
