public class Country {
    private String name;
    private HighPoint highPoints;

    public Country(String name, HighPoint highPoints) {
        this.name = name;
        this.highPoints = highPoints;
    }

    public String getName() {
        return this.name;
    }

    public int getHighestPoint() {
        return this.highPoints.getHeight();
    }

    public String getHighestPointName() {
        return this.highPoints.getName();
    }

    public String toString() {
        return this.name
                + " has it's highest point at "
                + this.highPoints.getName()
                + " at "
                + this.highPoints.getHeight()
                + " meters.";
    }
}
