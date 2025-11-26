package Sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class MainHashSet {
    public static void main(String[] args) {
        HashSet<String> ct = new HashSet<>();
        ct.add("Baku");
        ct.add("Ganja");
        ct.add("Ankara");
        ct.add("Istanbul");
        System.out.println(ct.size());
        System.out.println(ct.contains("Baku"));
        System.out.println(ct.remove("Istanbul"));
        System.out.println(ct);

        Set<String> letters = new LinkedHashSet<>();
        letters.add("A");
        letters.add("B");
        System.out.println(letters);
    }
}
