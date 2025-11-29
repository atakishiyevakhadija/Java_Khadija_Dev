package Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
    public static void main(String[] args) {
        //1
        HashMap<String, Double> grades = new HashMap<>();
        grades.put("Maryam", 45.8);
        grades.put("Maya", 56.3);
        grades.put("Aylin", 90.8);
        grades.put("Leyla", 89.7);
        System.out.println(grades);

        //2
        TreeMap<Integer, Double> balance = new TreeMap<>();
        balance.put(1, 233.8);
        balance.put(2, 456.9);
        balance.put(3, 589.3);
        balance.put(4, 367.5);
        System.out.println(balance);

        //3
        Map<Integer, String> books = new LinkedHashMap<>();
        books.put(178657, "Harry Potter");
        books.put(3626255, "Sherlok Holms");
        books.put(3524356, "Detective");
        System.out.println(books);
    }
}
