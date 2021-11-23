public class HighPoint {
    private String name;
    private int height;

    public HighPoint(String name, int height) {
        this.name = name;
        if (height
                < 0) {
            this.height = 0;
        } else {
            this.height = height;
        }
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    public String toString() {
        return this.name
                + ": ("
                + this.height
                + ")";
    }
}
