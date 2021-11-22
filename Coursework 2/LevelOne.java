import java.util.ArrayList;

public class LevelOne {

}

class Country {
    private String name;
    private int population;
    private int popsOutOfCities;
    private ArrayList<City> cities = new ArrayList<City>();
    private String outString;
    private int popsInCities;

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
        this.outString = "";
    }

    public void addCity(String city, int population, int timeZone) {
        cities.add(new City(city, population, timeZone));
        this.popsInCities += population;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        this.popsOutOfCities = this.population
                - this.popsInCities;
        String out = this.name
                + ": total population: "
                + this.population
                + ", population outside listed cities: "
                + this.popsOutOfCities
                + ", with cities";
        this.outString = out;
        this.outString += "\n";
        for (City city : cities) {
            this.outString += city.toString()
                    + "\n";
        }
        return this.outString;
    }
}

class City {
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
