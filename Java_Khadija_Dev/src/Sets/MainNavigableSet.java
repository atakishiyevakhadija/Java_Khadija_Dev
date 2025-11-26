package Sets;

import java.util.NavigableSet;
import java.util.TreeSet;

public class MainNavigableSet {
    public static void main(String[] args) {
        NavigableSet<Integer> numbers = new TreeSet<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println(numbers.lower(29));
        System.out.println(numbers.higher(29));
        System.out.println(numbers.floor(35));
        System.out.println(numbers.ceiling(39));
    }
}
