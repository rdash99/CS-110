import java.util.Scanner;
public class HelloYou {
    public static void main(String[] args) {

        //create scanner
        Scanner scan = new Scanner(System.in);

        //Greetings
        System.out.println("What is your name?");
        String name = scan.nextLine();
        System.out.println("Hello " + name + "!");

        //Fruit conversation
        System.out.println(name + ", what is your favorite fruit?");
        String fruit = scan.nextLine();
        System.out.println("I love " + fruit + " too " + name);
    
    }
}
