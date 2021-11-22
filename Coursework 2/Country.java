import java.util.ArrayList;

public class Country {
    private String name;
    private int population;
    private int popsOutOfCities;
    private ArrayList<> cities = new ArrayList<City>();

    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }

    public void addCity(String city, int population, int timeZone) {
        cities.add(new City(city, population, timeZone));
        this.popsOutOfCities += population;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        System.out.println(this.name
                + " total population: "
                + this.population
                + ", population outside listed cities: "
                + this.popsOutOfCities
                + ", with cities");
        for (City city : cities) {
            System.out.println(city.toString());
        }
    }
}
