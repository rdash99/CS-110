import java.util.Scanner;

public class RichterEarthquakeScale {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double input = 0.0;

        System.out.println("Enter a value on the Richter scale with a decimal point:");
        input = in.nextDouble();

        if (input >= 1.0 && input <= 1.9) {
            System.out.println("Microearthquakes, not felt, or felt rarely.");
        } else if (input >= 2.0 && input <= 2.9) {
            System.out.println("Felt slightly by some people. No damage to buildings.");
        } else if (input >= 3.0 && input <= 3.9) {
            System.out.println("Often felt by people, but very rarely causes damage."
                    + " Shaking of indoor objects can be noticeable.");
        } else if (input >= 4.0 && input <= 4.9) {
            System.out.println("Noticeable shaking of indoor objects and rattling noises."
                    + " Felt by most people in the affected area. Slightly felt outside."
                    + " Generally causes zero to minimal damage." + " Moderate to significant damage very unlikely."
                    + " Some objects may fall off shelves or be knocked over.");
        } else if (input >= 5.0 && input <= 5.9) {
            System.out.println("Can cause damage of varying severity to poorly constructed buildings."
                    + " Zero to slight damage to all other buildings. Felt by everyone.");
        } else if (input >= 6.0 && input <= 6.9) {
            System.out.println("Damage to a moderate number of well-built structures in populated areas."
                    + " Earthquake-resistant structures survive with slight to moderate damage."
                    + " Poorly designed structures receive moderate to severe damage."
                    + " Felt in wider areas; up to hundreds of kilometers from the epicenter."
                    + " Strong to violent shaking in epicentral area.");
        } else if (input >= 7.0 && input <= 7.9) {
            System.out.println("Causes damage to most buildings,"
                    + " some to partially or completely collapse or receive severe damage."
                    + " Well-designed structures are likely to receive damage."
                    + " Felt across great distances with major damage mostly limited to 250 km from epicenter.");
        } else if (input >= 8.0 && input <= 8.9) {
            System.out.println("Major damage to buildings, structures likely to be destroyed."
                    + " Will cause moderate to heavy damage to sturdy or earthquake-resistant buildings."
                    + " Damaging in large areas. Felt in extremely large regions.");
        } else if (input >= 9.0) {
            System.out.println("At or near total destruction – severe damage or collapse to all buildings."
                    + " Heavy damage and shaking extends to distant locations."
                    + " Permanent changes in ground topography.");
        }
    }

}
