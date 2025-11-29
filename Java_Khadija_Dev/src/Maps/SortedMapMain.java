package Maps;

import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapMain {
    public static void main(String[] args) {
        SortedMap<Integer, String> grades = new TreeMap<>();
        grades.put(1, "D");
        grades.put(2, "B");
        grades.put(3, "A");
        grades.put(4, "C");
        grades.put(5, "F");
        System.out.println(grades);

    }
}
