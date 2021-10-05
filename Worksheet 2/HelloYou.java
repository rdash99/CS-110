import java.text.Format;
import java.util.Scanner;

/* A program to greet the user and strike up a conversation. */
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
        System.out.println("I love " + fruit.toLowerCase() + " too " + name);

        //Hobbies conversation
        System.out.println(name + ", what is one of your hobbies?");
        String hobby = scan.nextLine();
        System.out.println(name + " I like doing " + hobby.toLowerCase() + " as well :)");
    
    }
}
