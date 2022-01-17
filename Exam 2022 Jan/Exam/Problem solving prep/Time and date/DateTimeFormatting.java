import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class DateTimeFormatting {
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

        // generate a date string with the current time in the format "yyyy/MM/dd HH:mm:ss"

        String date = "1998/03/16 22:03:02";
        //System.out.println(date);

        // parse a date string in the format "yyyy/MM/dd HH:mm:ss" to miliseconds
        long milliSeconds = LocalDateTime.parse(date, df).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
        //System.out.println(milliSeconds);

        //to turn back to string format
        LocalDateTime dmils = LocalDateTime.ofInstant(Instant.ofEpochMilli(milliSeconds), ZoneId.systemDefault());
        String dateString = dmils.format(df);
        //System.out.println(dateString);

        long target = 735764000L;
        long difference = 0;

        long milliSecondsOut = (LocalDateTime.parse("2047/11/07 09:00:42", df).atZone(ZoneId.systemDefault())
                .toInstant().toEpochMilli())
                - (LocalDateTime.parse("2047/10/29 20:37:58", df).atZone(ZoneId.systemDefault()).toInstant()
                        .toEpochMilli());
        System.out.println(milliSecondsOut
                == target);
    }
}
