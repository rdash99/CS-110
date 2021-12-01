import java.util.ArrayList;

/* A class for a country object, created by Rowan Dash (2106866).
SpLD Marking considerations apply
Feedback response: the layout weirdness is a side effect of my formatter,
I am currently trying to change it*/
public class Country {
    private String name;
    private int population;
    private int popsOutOfCities;
    private ArrayList<City> cities = new ArrayList<City>();
    private String outString;
    private int popsInCities;
    private int cityIndex;

    // Constructor
    public Country(String name, int population) {
        this.name = name;
        if (population
                < 0) {
            this.population = 0;
        } else {
            this.population = population;
        }
        //intialise the output string variable
        this.outString = "";
    }

    //add a city object to the country
    public void addCity(String city, int population, int timeZone) {
        cities.add(new City(city, population, timeZone));
        if (population
                < 0) {
            population = 0;
        }
        this.popsInCities += population;
    }

    //Return the Country's name
    public String getName() {
        return name;
    }

    //String formatting for the output
    public String toString() {
        this.popsOutOfCities = this.population
                - this.popsInCities;

        //format the output string
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

        //return the formmated output string
        return this.outString;
    }

    //retrive a city by name
    public City getCityByName(String cityName) {
        for (City city : this.cities) {
            if (city.getName().equals(cityName)) {
                this.cityIndex = this.cities.indexOf(city);
                return city;
            }
        }
        return null;
    }

    //delete a city by name
    public boolean deleteCity(String cityName) {
        for (City city : this.cities) {
            if (city.getName().equals(cityName)) {
                this.cityIndex = cities.indexOf(city);
                this.popsInCities -= city.getPopulation();
                this.cities.remove(city);
                return true;
            }
        }
        return false;
    }

    //Check if the data in the Country object is legal
    public boolean isLegalData() {
        if (this.population
                <= 0) {
            return false;
        }
        if (this.popsInCities
                > this.population) {
            return false;
        }
        if (this.popsInCities
                <= 0) {
            return false;
        }
        if (this.name.equals("")
                || this.name.equals(" ")
                || this.name.equals(null)) {
            return false;
        }
        return true;
    }
}
