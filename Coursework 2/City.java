/* A class for a city object, created by Rowan Dash (2106866).
SpLD Marking considerations apply */
public class City {
    private String name;
    private int population;
    private int timeZone;
    private String megacityOutput;

    //constructor
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

    //return the population of the city
    public int getPopulation() {
        return this.population;
    }

    //return the name of the city
    public String getName() {
        return this.name;
    }

    //calculate the time difference between this city and another
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

    //return a formatted string
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

    //check if the data in this city is valid
    public boolean isLegalData() {
        if (this.population
                <= 0
                || this.timeZone
                        <= -12
                || this.timeZone
                        >= 11
                || this.name.equals(null)) {
            return false;
        } else {
            return true;
        }
    }

}
