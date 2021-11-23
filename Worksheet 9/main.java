public class main {
    public static void main(String[] args) {
        Continent southAmerica = new Continent();

        Country southAmericanRepublic = new Country("Argentina", new HighPoint("Aconcagua", 6960));
        southAmerica.addCountry(southAmericanRepublic);
        southAmerica.printCountries();

        Country anotherSouthAmericanRepublic = new Country("Columbia", new HighPoint("Pico Cristóbal Colón", 5730));
        southAmerica.addCountry(anotherSouthAmericanRepublic);
        southAmerica.printCountries();
        southAmerica.getHighestPoint();

    }
}
