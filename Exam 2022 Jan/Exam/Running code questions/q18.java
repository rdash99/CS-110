class q18 {
    public static void main(String[] args) {
        for (int i = 3; i
                < 8; i++) {
            System.out.print(Math.round((new Mystery1(i, i)).method())
                    + " ");
        }
    }
}

class Mystery1 {
    private final int s;
    private final int n;

    public Mystery1(int a, int b) {
        s = a;
        n = b;
    }

    public double method() {
        return s
                * s
                * n
                / 4
                * Math.tan(Math.PI
                        / n);
    }
}