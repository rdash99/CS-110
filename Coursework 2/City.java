/* A class for a city object, created by Rowan Dash (2106866).
SpLD Marking considerations apply */
public class City {
    private String name;
    private int population;
    private int timeZone;
    private String megacityOutput;
    private final int megaCityThreshold = 10000000;
    private final int timeZoneLowerBound = -12;
    private final int timeZoneUpperBound = 11;

    //constructor
    public City(String name, int population, int timeZone) {
        this.name = name;
        this.timeZone = timeZone;

        //population is set to 0 if it is negative
        if (population
                < 0) {
            this.population = 0;
        } else {
            this.population = population;
        }

        //check if the city is a megacity
        if (population
                >= megaCityThreshold) {
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

    //return the time zone of the city
    public int getTimeZone() {
        return this.timeZone;
    }

    //calculate the time difference between this city and another city
    public int timeDifference(City other) {
        int calc = 0;

        if (this.timeZone
                == other.getTimeZone()) {
            return 0;
        } else if (this.timeZone
                > other.getTimeZone()) {
            calc = other.getTimeZone()
                    - this.timeZone;
        } else {
            calc = this.timeZone
                    - other.getTimeZone();

        }

        return calc;
    }

    //return a formatted string for the city output
    public String toString() {
        int timeZoneOut;
        if (this.timeZone
                < timeZoneLowerBound
                || this.timeZone
                        > timeZoneUpperBound) {
            timeZoneOut = 0;
        } else {
            timeZoneOut = this.timeZone;
        }
        return this.name
                + ": has population "
                + this.population
                + " and is in time zone "
                + timeZoneOut
                + ". It IS"
                + megacityOutput
                + " a megacity";
    }

    //check if the data in this city is valid
    public boolean isLegalData() {
        if (this.population
                == 0) {
            return false;
        } else if (this.timeZone
                < timeZoneLowerBound
                || this.timeZone
                        > timeZoneUpperBound) {
            return false;
        } else {
            return true;
        }
    }

}
