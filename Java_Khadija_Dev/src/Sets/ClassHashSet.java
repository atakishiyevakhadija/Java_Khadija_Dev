package Sets;

import java.util.HashSet;

public class ClassHashSet {
    public static void main(String[] args) {
        HashSet<Integer> num = new HashSet<>();
        num.add(10);
        num.add(5);
        num.add(10);
        num.add(7);
        System.out.println(num);
        // Повтор исчез потому что set не показывает одно и то же
    }
}
