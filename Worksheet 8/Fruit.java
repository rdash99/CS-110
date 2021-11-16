public class Fruit {
    private String name;
    private String color;

    public Fruit(final String name, final String color) {
        this.name = name;
        this.color = color;
    }

    public String toString() {
        String out = "A "
                + color
                + " "
                + name;
        return out;
    }

    public static void main(final String[] args) {
        Fruit apple = new Fruit("apple", "red");
        Fruit banana = new Fruit("banana", "yellow");
        Fruit orange = new Fruit("orange", "orange");
        Fruit pear = new Fruit("pear", "green");
        Fruit grape = new Fruit("grape", "purple");
        Fruit[] fruits = { apple, banana, orange, pear, grape };
        for (Fruit f : fruits) {
            System.out.println(f);
        }
    }
}
