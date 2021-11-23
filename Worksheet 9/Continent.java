import java.util.ArrayList;

public class Continent {
    private ArrayList<Country> countries = new ArrayList<Country>();

    public void addCountry(Country country) {
        countries.add(country);
    }

    public void getHighestPoint() {
        int highest = countries.get(0).getHighestPoint();
        String countryName = "";
        String pointName = "";
        Country highestCountry = countries.get(0);
        for (Country country : countries) {
            if (country.getHighestPoint()
                    > highest) {
                highest = country.getHighestPoint();
                countryName = country.getName();
                pointName = country.getHighestPointName();
                highestCountry = country;

            }
        }
        System.out.println(highestCountry.getName()
                + " has the highest point at "
                + highestCountry.getHighestPointName()
                + ". Which is "
                + highest
                + " meters above sea level.");
    }

    public void printCountries() {
        for (Country country : countries) {
            System.out.println(country);
        }
    }
}
