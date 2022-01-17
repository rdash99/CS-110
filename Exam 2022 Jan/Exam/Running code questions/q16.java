public class q16 {
    public static void main(String[] args) {
        q18 obj1 = new q18();
        q18 obj2 = new q18();

        obj1.setX(0);
        obj1.addOne();
        obj2.addOne();
        System.out.println(obj1.getX()
                + " "
                + obj2.getX());
    }
}

class Mystery2 {
    private static int x;

    public void addOne() {
        x++;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }
}
