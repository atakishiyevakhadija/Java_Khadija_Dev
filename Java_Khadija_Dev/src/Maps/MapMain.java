package Maps;

import java.util.HashMap;
import java.util.Map;

public class MapMain {
    public static void main(String[] args) {
        Map<Integer, String> personal_data = new HashMap<>();
        personal_data.put(438714891, "Khadija");
        personal_data.put(46312876, "Halima");
        personal_data.put(47326722, "Murad");
        System.out.println(personal_data.get(47326722));
    }
}
