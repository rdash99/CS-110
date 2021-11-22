/*
CS-110 Autotest for Level 2 - at this level you need to be able to
1. do everything in Autotest for Level 1
2. look up cities by name
3. get the name of a city from a city (this is NOT the same as 2. above)
4. work out the time difference between two cities
*/
public class AutoTestLevel2 {
    public static void main(String[] args) {
        
        //LEVEL 1 TESTS
        Country argentina = new Country("Argentina", 45605800);
        argentina.addCity("Buenos Aires",13588200, -3);
        argentina.addCity("Cordoba", 1454650, -3);
        argentina.addCity("Rosario", 1236000, -3);
        argentina.addCity("Mendoza", 937200,-3);
        argentina.addCity("La Plata", 794300, -3);
        
        System.out.println(argentina);
        
        Country usa = new Country("USA", 331449300);
        usa.addCity("New York", 20140470, -5);
        usa.addCity("Dallas", 7637390, -6);
        usa.addCity("Phoenix", 4845800, -7);
        usa.addCity("Los Angeles", 13201000, -8);
        
        System.out.println(usa);
        
        Country russia = new Country("Russia", 146171000);
        russia.addCity("Moscow", 12506500, 3);
        russia.addCity("Vladivostok", 60500, 10);
        russia.addCity("Yekaterinburg", 1350000, 5);
        russia.addCity("Novosibirsk", 143750, 7);
        
        System.out.println(russia);
        
        //LEVEL 2 Tests
        //Work out the time difference between "Cordoba" and "Novosibirsk"
        //Note you need three methods to do this: getCityByName, getCity, and timeDifference
        System.out.printf("Time difference between %s and %s is %d hours%n",
            argentina.getCityByName("Cordoba").getName(),
            russia.getCityByName("Novosibirsk").getName(),
            argentina.getCityByName("Cordoba").timeDifference(russia.getCityByName("Novosibirsk")));
        //Work out the time difference between "Phoenix" and "Buenos Aires"
        System.out.printf("Time difference between %s and %s is %d hours%n",
            usa.getCityByName("Phoenix").getName(),
            argentina.getCityByName("Buenos Aires").getName(),
            usa.getCityByName("Phoenix").timeDifference(argentina.getCityByName("Buenos Aires")));
    }
}
