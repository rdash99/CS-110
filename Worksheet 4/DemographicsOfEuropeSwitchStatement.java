import java.util.Scanner;

public class DemographicsOfEuropeSwitchStatement {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String capital = "";
        String population = "";

        System.out.println("Enter the captial of Andorra, Jersey, Liechtenstein or Slovenia:");
        capital = in.nextLine();

        switch (capital) {
            case "Andorra la Vella":
                population = "77,006";
                System.out.println(
                        capital + " is the capital of Andorra, which has a population of " + population + " people");
                break;

            case "Saint Helier":
                population = "97,857";
                System.out.println(
                        capital + " is the capital of Jersey, which has a population of " + population + " people");
                break;

            case "Vaduz":
                population = "37,910";
                System.out.println(capital + " is the capital of Liechtenstein, which has a population of " + population
                        + " people");
                break;

            case "Ljubljana":
                population = "2,077,837";
                System.out.println(
                        capital + " is the capital of Slovenia, which has a population of " + population + " people");
                break;
            default:
                System.out.println("Capital not known");
                break;
        }
    }
}
