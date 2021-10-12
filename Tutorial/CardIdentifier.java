import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CardIdentifier {
    public static void main(String[] args){

        List EXPECTED_FIRST_CHAR = new ArrayList();

        int i = 0;
        while (i<=9){
            String number = i.toString();
            EXPECTED_FIRST_CHAR.add(number); //TODO Convert to string
            i +=1;
        }
        EXPECTED_FIRST_CHAR.add("J");
        EXPECTED_FIRST_CHAR.add("K");
        EXPECTED_FIRST_CHAR.add("Q");
        EXPECTED_FIRST_CHAR.add("A");

        

        List EXPECTED_LAST_CHAR = new ArrayList();

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
            
            System.out.println(EXPECTED_FIRST_CHAR.contains(char1));

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
        if (char1.equals("0")){
            System.out.println("Yay"); //TODO Work out meaning of card code
        }
    }
}
