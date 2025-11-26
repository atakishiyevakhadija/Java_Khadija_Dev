package Lists;

import java.util.ArrayList;
import java.util.List;

public class ListHw {
    public static void main(String[] args) {
        //1
        List<String> lt = new ArrayList<>();
        lt.add("Baku");
        lt.add("Sumgait");
        lt.add("Sheki");
        lt.add("Qabala");
        lt.add("Oquz");
        lt.add("Qax");
        System.out.println(lt);
        lt.remove(2);
        System.out.println(lt);

        //2
        List<Integer> lt2 = new ArrayList<>();
        lt2.add(45);
        lt2.add(37);
        lt2.add(20);
        lt2.add(10);
        lt2.add(19);
        lt2.add(30);
        System.out.println(lt2);
        lt2.set(1, 100);
        System.out.println(lt2);

        //3
        List<String> lt3 = new ArrayList<>();
        lt3.add("Maryam");
        lt3.add("Aylin");
        lt3.add("Maya");
        lt3.add("Leyla");
        lt3.add("Aylin");
        lt3.add("Maryam");
        System.out.println(lt3);
        System.out.println(lt3.indexOf("Aylin"));
        System.out.println(lt3.lastIndexOf("Maryam"));
    }
}
