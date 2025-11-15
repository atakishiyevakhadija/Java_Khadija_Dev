package DateClasses;

import java.sql.SQLOutput;
import java.util.Calendar;

public class MainCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        String month[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        System.out.println(month[calendar.get(Calendar.MONTH)]);
        System.out.println(calendar.get(Calendar.DATE));
        System.out.println(calendar.get(Calendar.YEAR));
        System.out.println("-----------------------------------");
        System.out.println("now");
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));
        System.out.println("changed time");
        calendar.set(Calendar.HOUR, 12);
        calendar.set(Calendar.MINUTE, 24);
        calendar.set(Calendar.SECOND, 36);
        System.out.println("changed time");
        System.out.println(calendar.get(Calendar.HOUR));
        System.out.println(calendar.get(Calendar.MINUTE));
        System.out.println(calendar.get(Calendar.SECOND));

    }
}
