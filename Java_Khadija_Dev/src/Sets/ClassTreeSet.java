package Sets;

import java.util.TreeSet;

public class ClassTreeSet {
    public static void main(String[] args) {
        TreeSet<Integer> num = new TreeSet<>();
        num.add(20);
        num.add(1);
        num.add(50);
        num.add(3);
        num.add(3);
        System.out.println(num);
    }
}
