package Sets;

import java.util.SortedSet;
import java.util.TreeSet;

public class MainSortedSet {
    public static void main(String[] args) {
        SortedSet<Integer> id = new TreeSet<>();
        id.add(1);
        id.add(5);
        id.add(-2);
        System.out.println(id);
    }
}
