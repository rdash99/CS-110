public class main {
    public static void main(String[] args) {
        Continent southAmerica = new Continent();

        Country southAmericanRepublic = new Country("Argentina", new HighPoint("Aconcagua", 6960));
        southAmerica.addCountry(southAmericanRepublic);

        southAmerica.printCountries();

        System.out.println("\n");

        Country anotherSouthAmericanRepublic = new Country("Columbia", new HighPoint("Pico Cristóbal Colón", 5730));
        southAmerica.addCountry(anotherSouthAmericanRepublic);
        System.out.println("\n");

        southAmerica.printCountries();
        southAmerica.getHighestPoint();

    }
}
