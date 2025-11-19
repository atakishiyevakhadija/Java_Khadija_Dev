package DateClasses;

import java.time.LocalDate;

public class MainLocalDateHw {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2025, 12, 14);
        System.out.println(ld);
        System.out.println(ld.plusDays(4));
        System.out.println(ld.plusWeeks(2));
        System.out.println(ld.plusMonths(1));
        System.out.println(ld.plusYears(2));
        System.out.println(ld.getDayOfYear());
        System.out.println(ld.minusDays(5));
        System.out.println(ld.minusWeeks(3));
        System.out.println(ld.minusMonths(2));
        System.out.println(ld.minusYears(1));
    }
}
