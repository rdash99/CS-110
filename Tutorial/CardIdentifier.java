import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardIdentifier {
    public static void main(String[] args){

        String firstString = "";
        String secondWord = "";

        final List EXPECTED_FIRST_CHAR = new ArrayList();

        int i = 0;
        while (i<=9){
            String number = String.valueOf(i);
            EXPECTED_FIRST_CHAR.add(number);
            i +=1;
        }
        EXPECTED_FIRST_CHAR.add("J");
        EXPECTED_FIRST_CHAR.add("K");
        EXPECTED_FIRST_CHAR.add("Q");
        EXPECTED_FIRST_CHAR.add("A");

        

        final List EXPECTED_LAST_CHAR = new ArrayList();

        EXPECTED_LAST_CHAR.add("S");
        EXPECTED_LAST_CHAR.add("C");
        EXPECTED_LAST_CHAR.add("H");
        EXPECTED_LAST_CHAR.add("D");


        Scanner in = new Scanner(System.in);
        
        System.out.println("Please enter a card identifier code below.");
        String code = in.nextLine();
        
        code = code.toUpperCase();

        String char1 = code.substring(0,1);
        String char2 = code.substring(1,2);

        //System.out.println("Card identifier code: " + char1 + char2);

        // Validation for card identifier code length and characters
        while (code.length()!=2 || EXPECTED_FIRST_CHAR.contains(char1) == false|| EXPECTED_LAST_CHAR.contains(char2) == false){
            
            //System.out.println(EXPECTED_FIRST_CHAR.contains(char1));

            if (code.length()!=2){
                System.err.println("Invalid card identifier code, the code should be two characters - please try again:");
                code = in.nextLine();
                code = code.toUpperCase();
                char1 = code.substring(0,1);
                char2 = code.substring(1,2);
            }
            if (EXPECTED_FIRST_CHAR.contains(char1) == false){
                System.err.println("Invalid card identifier code, the first character should be one of the following, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, J, Q, K or A please reenter below:");
                code = in.nextLine();
                code = code.toUpperCase();
                char1 = code.substring(0,1);
                char2 = code.substring(1,2);
            }

            if (EXPECTED_LAST_CHAR.contains(char2) == false){
                System.err.println("Invalid card identifier code, the second character should be one of the following, S, C, H or D please reenter below:");
                code = in.nextLine();
                code = code.toUpperCase();
                char1 = code.substring(0,1);
                char2 = code.substring(1,2);
            }
        }
        //Check what the first character is
        if (char1.equals("0")){
            firstString = "the 10 of ";
        }else if(char1.equals("1")){
            firstString = "the 1 of ";
        }else if(char1.equals("2")){
            firstString = "the 2 of ";
        }else if(char1.equals("3")){
            firstString = "the 3 of ";
        }else if(char1.equals("4")){
            firstString = "the 4 of ";
        }else if (char1.equals("5")){
            firstString = "the 5 of ";
        }else if (char1.equals("6")){
            firstString = "the 6 of";
        }else if (char1.equals("7")){
            firstString = "the 7 of ";
        }else if (char1.equals("8")){
            firstString = "the 8 of ";
        }else if(char1.equals("9")){
            firstString = "the 9 of ";
        }else if (char1.equals("J")){
            firstString = "the Jack of ";
        }else if (char1.equals("Q")){
            firstString = "the Queen of ";
        }else if (char1.equals("K")){
            firstString = "the King of ";
        }else{
            firstString = "the Ace of ";
        }
        //System.out.println(firstString);

        //Check what the second character is
        if (char2.equals("H")){
            secondWord = "Hearts.";
        }else if (char2.equals("C")){
            secondWord = "Clubs.";
        }else if (char2.equals("D")){
            secondWord = "Diamonds.";
        }else if (char2.equals("S")){
            secondWord = "Spades.";
        }
        //System.out.println(secondWord);

        System.out.println("Your card is " + firstString + secondWord);
    }
}
