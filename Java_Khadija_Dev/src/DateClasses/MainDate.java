package DateClasses;

import java.util.Date;

public class MainDate {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println("Сегодняшняя дата: " + now);
        long get_time = now.getTime();
        System.out.println(get_time);
    }
}
