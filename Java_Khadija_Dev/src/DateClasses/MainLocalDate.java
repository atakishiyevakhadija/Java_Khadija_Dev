package DateClasses;

import java.time.DayOfWeek;
import java.time.LocalDate;

public class MainLocalDate {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        System.out.println(ld.getYear());
        System.out.println(ld.getDayOfMonth());
        System.out.println(ld.getMonthValue());

        DayOfWeek dayOfWeek = DayOfWeek.of(6);
        System.out.println(dayOfWeek);
    }
}
