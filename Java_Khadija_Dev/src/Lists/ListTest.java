package Lists;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<String> films = new ArrayList<>();

        films.add("Avatar");
        films.add("Wednesday");
        films.add("Squid game");
        films.add("Zootopia");
        films.add("Home alone");
        System.out.println(films);

        films.set(0, "Harry potter");
        System.out.println(films);
        System.out.println(films.get(2));
        films.remove(1);
        System.out.println(films);
    }
}
