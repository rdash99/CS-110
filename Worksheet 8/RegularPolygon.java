public class RegularPolygon {
    private long length;
    private int numberOfSides;

    public RegularPolygon(final long length, final int numberOfSides) {
        this.length = length;
        this.numberOfSides = numberOfSides;
    }

    public long getLength() {
        return this.length;
    }

    public int getNumberOfSides() {
        return this.numberOfSides;
    }

    public double getArea() {
        double area = 0;
        area = (((this.length
                * this.length)
                * this.numberOfSides)
                / (4
                        * Math.tan(Math.PI
                                / this.numberOfSides)));
        return area;
    }

    public void setLength(final long length) {
        this.length = length;
    }

    public void setNumberOfSides(final int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }
}
