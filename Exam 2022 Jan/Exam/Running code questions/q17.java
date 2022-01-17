class q17 {
    public static void main(String[] args) {
        Mystery2 obj1 = new Mystery2();
        Mystery2 obj2 = new Mystery2();

        obj1.setX(0);
        obj1.setY(0);
        obj1.accumulate(1, 2);
        obj2.setX(0);
        obj2.accumulate(2, 3);
        System.out.println(obj1.getX()
                + " "
                + obj2.getY());
    }
}

class Mystery2 {
    private int x;
    private static int y;

    public void accumulate(int a, int b) {
        x += a;
        y += b;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int a) {
        x = a;
    }

    public void setY(int a) {
        y = a;
    }
}