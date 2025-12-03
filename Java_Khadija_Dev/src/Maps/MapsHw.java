package Maps;

import java.util.*;

public class MapsHw {
    public static void main(String[] args) {
        //1
        HashMap<String, Integer> student = new HashMap<>();
        student.put("Maryam", 14);
        student.put("Samir", 13);
        student.put("Maya", 16);
        student.put("Aylin", 17);
        student.put("Nazli", 12);
        student.put("Stiv", 18);
        student.put("Mark", 23);
        System.out.println(student);

        //2
        Map<Integer, String> lessons = new LinkedHashMap<>();
        lessons.put(1, "Map");
        lessons.put(2, "Set");
        lessons.put(3, "List");
        lessons.put(4, "Casting");
        System.out.println(lessons);

        //3
        TreeMap<Double, String> games = new TreeMap<>();
        games.put(5.0, "Geometry Dash");
        games.put(3.7, "Block Blast");
        games.put(1.2, "Roblox");
        games.put(3.8, "Genshin Impact");
        games.put(4.3, "Brawl Stars");
        games.put(2.7, "Sekay");
        games.put(3.4, "Wood Turning");
        games.put(1.9, "Minecraft");
        System.out.println(games);

        //5
        NavigableMap<Integer, Integer> nums = new TreeMap<>();
        nums.put(10, 1);
        nums.put(20, 2);
        nums.put(30, 3);
        nums.put(40, 4);
        nums.put(50, 5);
        System.out.println(nums.lowerKey(25));
        System.out.println(nums.higherKey(25));
        System.out.println(nums.floorKey(30));
        System.out.println(nums.ceilingKey(30));
    }
}
