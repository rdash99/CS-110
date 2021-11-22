/*
CS-110 Autotest for Level 1 - at this level you need to be able to
1. create Country objects each with a name and population
2. add cities to each country with specified name, population and timezone
3. print out countries in the format specified by the coursework
*/
public class AutoTestLevel1 {
    public static void main(String[] args) {
        //LEVEL 1 TESTS
        //Create a country "Argentina" and add cities to it
        Country argentina = new Country("Argentina", 45605800);
        argentina.addCity("Buenos Aires",13588200, -3);
        argentina.addCity("Cordoba", 1454650, -3);
        argentina.addCity("Rosario", 1236000, -3);
        argentina.addCity("Mendoza", 937200,-3);
        argentina.addCity("La Plata", 794300, -3);
        
        //Print out the details of Argentina and it's cities
        System.out.println(argentina);
        
        //As above but for "USA"
        Country usa = new Country("USA", 331449300);
        usa.addCity("New York", 20140470, -5);
        usa.addCity("Dallas", 7637390, -6);
        usa.addCity("Phoenix", 4845800, -7);
        usa.addCity("Los Angeles", 13201000, -8);
        
        System.out.println(usa);
        
        //As above but for "Russia"
        Country russia = new Country("Russia", 146171000);
        russia.addCity("Moscow", 12506500, 3);
        russia.addCity("Vladivostok", 60500, 10);
        russia.addCity("Yekaterinburg", 1350000, 5);
        russia.addCity("Novosibirsk", 143750, 7);
        
        System.out.println(russia);
    }
}
