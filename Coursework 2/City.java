/* A class for a city object, created by Rowan Dash (2106866).
SpLD Marking considerations apply */
public class City {
    private String name;
    private int population;
    private int timeZone;
    private String megacityOutput;

    public City(String name, int population, int timeZone) {
        this.name = name;
        this.population = population;
        this.timeZone = timeZone;
        if (population
                >= 10000000) {
            this.megacityOutput = "";
        } else {
            this.megacityOutput = " NOT";
        }
    }

    public String getName() {
        return this.name;
    }

    public int timeDifference(City other) {
        if (this.timeZone
                == other.timeZone) {
            return 0;
        } else if (this.timeZone
                > other.timeZone) {
            return other.timeZone
                    - this.timeZone;
        } else {
            return this.timeZone
                    - other.timeZone;
        }
    }

    public String toString() {
        return this.name
                + ": has population "
                + this.population
                + " and is in time zone "
                + this.timeZone
                + ". It IS"
                + megacityOutput
                + " a megacity";
    }

}
