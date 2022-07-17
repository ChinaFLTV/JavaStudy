package Java常用类;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.*;
import java.util.Calendar;
import java.util.Date;

/**
 * *@Author LiGuanda
 * *@Data 2022/4/19 上午 10:55
 * *@Description This is a description of DateTest
 * *@Params
 * *@Return
 * *@Since versio-1.0
 */


public class DateTest {

    public static void main(String[] args) throws ParseException {

        System.out.println(System.currentTimeMillis());
        System.out.println(new Date());
        System.out.println(new Date(System.currentTimeMillis()));
        System.out.println(new Date().getTime());

        System.out.println(new Date().toString());

        SimpleDateFormat sdf = new SimpleDateFormat();
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-mm-dd hh-mm-ss zzz");
        System.out.println(sdf1.format(new Date()));
        String s = "2022-4-19 11-04-66 CST";
        System.out.println(sdf1.parse(s));
        SimpleDateFormat sdf2 = new SimpleDateFormat("yy-mm-dd");
        System.out.println(sdf2.format(new Date()));

        SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy年mm月dd日hh时mm分ss秒 EEE");
        System.out.println(sdf3.parse("2022年4月19日11时8分22秒 星期二"));

        Calendar c = Calendar.getInstance();
        System.out.println(c.getTime());
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_WEEK));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
        System.out.println(c.get(Calendar.DAY_OF_YEAR));
        System.out.println(c.get(Calendar.HOUR_OF_DAY));
        System.out.println(c.get(Calendar.MINUTE));
        System.out.println(c.get(Calendar.SECOND));
        c.set(Calendar.MONTH, 4);
        System.out.println(c.get(Calendar.MONTH));
        c.add(Calendar.MONTH, -1);
        System.out.println(c.get(Calendar.MONTH));

        LocalTime l = LocalTime.now();
        System.out.println(l);
        LocalDate l1 = LocalDate.now();
        System.out.println(l1);
        LocalDateTime l2 = LocalDateTime.now();
        System.out.println(l2);
        // LocalDateTime l3 = LocalDateTime.of();
        LocalTime l4 = LocalTime.of(11, 27);
        System.out.println(l4);
        LocalDate l5 = LocalDate.of(2022, 4, 19);
        System.out.println(l5);
        LocalDateTime l6 = LocalDateTime.of(2022, 4, 19, 11, 28, 56, 666);

        System.out.println(l6);
        System.out.println(l6.getDayOfMonth());
        System.out.println(l6.getDayOfYear());
        System.out.println(l6.getDayOfWeek());
        System.out.println(l6.getMonth());
        System.out.println(l6.getYear());
        System.out.println(l6.getMonthValue());
        System.out.println(l6.getHour());
        System.out.println(l6.getMinute());
        System.out.println(l6.getSecond());

        System.out.println(l6.withDayOfMonth(20));
        System.out.println(l6.withDayOfYear(109));
        l6.plusYears(1);
        System.out.println(l6.plusYears(2));
        System.out.println(l6.plusWeeks(1));
        System.out.println(l6.minusHours(1));


        Instant i  =Instant.now();
        System.out.println(i);
        System.out.println(Instant.ofEpochMilli(6));
        System.out.println(Instant.EPOCH.toEpochMilli());
        System.out.println(i.toEpochMilli());

        System.out.println(i.atOffset(ZoneOffset.UTC));



    }

}
