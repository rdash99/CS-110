import java.time.format.DateTimeFormatter;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class q21 {
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        long total = 0;
        long difference = 0;
        long second = 0;
        String dateList[] = { "1979/08/02 13:45:22", "2069/08/23 19:08:58", "2004/04/29 23:47:47",
                "1998/06/27 19:06:14", "1982/03/19 23:08:20", "2005/12/04 07:50:11", "2046/02/17 15:04:55",
                "1980/07/22 14:38:36", "2040/09/26 10:29:22", "1985/05/29 01:11:54", "1979/09/02 00:45:03",
                "2047/12/26 02:22:25", "1999/02/08 22:04:28", "2064/06/28 08:53:34", "2052/02/21 10:04:27",
                "2040/11/19 20:17:10", "2053/01/08 21:03:03", "2053/02/07 04:30:32", "2050/05/13 02:44:23",
                "2021/08/25 14:47:42", "2056/02/01 19:51:28", "2026/11/09 17:40:33", "2060/11/21 12:03:58",
                "2005/10/26 14:17:26", "2060/01/08 00:02:48", "2035/10/22 19:09:06", "1970/02/27 07:16:40",
                "2064/08/01 07:00:45", "1998/10/18 09:44:02", "2010/07/29 00:31:28", "2003/05/29 05:37:17",
                "1974/10/25 02:30:02", "1985/04/10 19:01:32", "2054/02/25 18:55:45", "2058/05/11 01:41:32",
                "2068/06/10 08:34:34", "2047/03/05 17:41:35", "2043/04/16 19:57:30", "2035/12/18 16:09:05",
                "1984/12/15 13:27:20", "1975/06/09 10:53:59", "2031/12/12 15:08:35", "2025/09/02 01:49:36",
                "2048/03/08 07:44:57", "2056/07/07 13:43:48", "2041/11/04 22:25:02", "2052/06/17 05:39:24",
                "2026/02/03 06:23:53", "1995/10/17 20:44:45", "1977/02/11 16:32:17", "2043/11/03 16:02:18",
                "1988/04/08 19:04:12", "2027/06/01 21:30:12", "2028/11/07 16:44:32", "1974/04/07 07:47:36",
                "2063/09/24 17:38:18", "2043/05/03 12:27:28", "1999/12/17 02:33:33", "1988/03/04 00:37:31",
                "1974/12/24 07:08:55", "2057/03/24 03:22:31", "1983/03/22 13:48:29", "2028/05/06 06:39:46",
                "2059/04/23 21:00:12", "1971/12/27 19:52:01" };
        //Go through the list of dates and parse them to milliseconds working out the difference between them and adding it to a total
        // if the difference is negative then make it positive and add it to the total
        System.out.println(dateList.length);
        for (int i = 0; i
                < dateList.length; i++) {
            long milliSeconds = LocalDateTime.parse(dateList[i], df).atZone(ZoneId.systemDefault()).toInstant()
                    .toEpochMilli();
            if (i
                    == dateList.length
                            - 1) {
                System.out.println(i);
                second = LocalDateTime.parse(dateList[i], df).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            } else {
                System.out.println(i);
                second = LocalDateTime.parse(dateList[i
                        + 1], df).atZone(ZoneId.systemDefault()).toInstant().toEpochMilli();
            }
            difference = milliSeconds
                    - second;
            if (difference
                    < 0) {
                difference = difference
                        * -1;
                total += difference;
            } else {
                total += difference;
            }

        }

        System.out.println(total);

    }
}
