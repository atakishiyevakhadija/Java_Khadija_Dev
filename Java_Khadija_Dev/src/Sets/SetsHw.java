package Sets;

import java.util.*;

public class SetsHw {
    public static void main(String[] args) {
        //1
        HashSet<String> countries = new HashSet<>();
        countries.add("Germany");
        countries.add("France");
        countries.add("Switzerland");
        countries.add("Iceland");
        countries.add("Turkey");
        countries.add("Azerbaijan");
        countries.add("USA");
        countries.add("Germany");
        countries.add("Iceland");
        System.out.println(countries);

        //2
        Set<String> names = new LinkedHashSet<>();
        names.add("Maryam");
        names.add("Maya");
        names.add("Natavan");
        names.add("Aylin");
        System.out.println(names);
        names.remove("Natavan");
        System.out.println(names);

        //3
        TreeSet<Double> grades = new TreeSet<>();
        grades.add(89.7);
        grades.add(56.8);
        grades.add(49.2);
        grades.add(67.3);
        grades.add(50.9);
        grades.add(78.6);
        grades.add(47.2);
        grades.add(39.8);
        grades.add(49.2);
        grades.add(50.9);
        System.out.println(grades);

        //4
        NavigableSet<Integer> num = new TreeSet<>();
        num.add(47);
        num.add(58);
        num.add(90);
        num.add(63);
        num.add(43);
        num.add(53);
        num.add(54);
        System.out.println(num.lower(49));
        System.out.println(num.higher(50));
        System.out.println(num.floor(50));
        System.out.println(num.ceiling(50));
    }
}
