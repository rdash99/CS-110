import java.util.ArrayList;

/* A class for a country object, created by Rowan Dash (2106866).
SpLD Marking considerations apply */
public class Country {
    private String name;
    private int population;
    private int popsOutOfCities;
    private ArrayList<City> cities = new ArrayList<City>();
    private String outString;
    private int popsInCities;
    private int cityIndex;

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

    public City getCityByName(String cityName) {
        for (City city : cities) {
            if (city.getName().equals(cityName)) {
                this.cityIndex = cities.indexOf(city);
                return city;
            }
        }
        return null;
    }
}
