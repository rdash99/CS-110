import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class q22 {
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        //Which of the times in the following list are closest to hour 811836 since 1970/01/01 01:00:00?
        //(Hint: use the Date class)
        String dateList[] = { "2062/07/17 08:06:40", "2062/07/19 20:41:57", "2062/08/25 01:23:54",
                "2062/08/12 13:38:34", "2062/08/16 14:02:27" };
        long total = 0;
        long difference = 0;
        long closest = 0;
        int closestIndex = 0;
        long target = 811836;
        long compare = LocalDateTime.parse("1970/01/01 01:00:00", df).atZone(ZoneId.systemDefault()).toInstant()
                .toEpochMilli();

        for (int i = 0; i
                < dateList.length; i++) {
            long milliSeconds = LocalDateTime.parse(dateList[i], df).atZone(ZoneId.systemDefault()).toInstant()
                    .toEpochMilli();
            difference = milliSeconds
                    - compare;
            //Convert the difference to hours
            difference = difference
                    / 3600000;
            System.out.println(difference);

        }

    }
}
