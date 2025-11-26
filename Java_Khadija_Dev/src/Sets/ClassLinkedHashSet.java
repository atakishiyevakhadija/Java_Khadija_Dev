package Sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class ClassLinkedHashSet {
    public static void main(String[] args) {
        Set<String> lan = new LinkedHashSet<>();
        lan.add("Java");
        lan.add("Python");
        lan.add("C++");
        lan.add("Java");
        System.out.println(lan);
        // Java, Python, C++
    }
}
