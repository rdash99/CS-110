import java.math.RoundingMode;
import java.text.DecimalFormat;

public class MilesToKilometers {
    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);

        final double DISTANCE_BETWEEN_CAMPUS = 5.5; // Distance in miles
        final double CONVERSION_CONSTANT = 1.609;

        //Convert from miles to kmph
        double kilometers = DISTANCE_BETWEEN_CAMPUS * CONVERSION_CONSTANT;

        //print result
        System.out.println("The distance between campuses is "
         + df.format(kilometers) + "km");
    }
}
