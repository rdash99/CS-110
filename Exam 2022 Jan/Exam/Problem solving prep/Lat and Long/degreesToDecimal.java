public class degreesToDecimal {
    public static void main(String[] args) {
        //convert from the degrees/minutes/seconds format to decimal
        // result = degrees + minutes/60 + seconds/3600
        // if the longitude is West, then the result should be negative
        // if the latitude is South, then the result should be negative
        // if the longitude is East, then the result should be positive
        // if the latitude is North, then the result should be positive
        // input: 51 37 01.5 N,3 52 41.0 W

        String input = "51 37 01.5 N,3 52 41.0 W";
        String[] parts = input.split(",");
        String[] lat = parts[0].split(" ");
        String[] longi = parts[1].split(" ");
        double latDeg = Double.parseDouble(lat[0]);
        double latMin = Double.parseDouble(lat[1]);
        double latSec = Double.parseDouble(lat[2]);
        double longiDeg = Double.parseDouble(longi[0]);
        double longiMin = Double.parseDouble(longi[1]);
        double longiSec = Double.parseDouble(longi[2]);
        double latDecimal = latDeg
                + latMin
                        / 60
                + latSec
                        / 3600;
        double longiDecimal = longiDeg
                + longiMin
                        / 60
                + longiSec
                        / 3600;
        if (lat[3].equals("S")) {
            latDecimal = -latDecimal;
        }
        if (longi[3].equals("W")) {
            longiDecimal = -longiDecimal;
        }
        System.out.println(latDecimal);
        System.out.println(longiDecimal);
    }
}
