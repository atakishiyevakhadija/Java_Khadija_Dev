package Lists;

import java.util.ArrayList;
import java.util.List;

public class MainLists {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("apple");
        System.out.println(fruits);

        List<String> fruits2 = new ArrayList<>();
        fruits2.addAll(fruits);
        System.out.println(fruits2);


        List<Double> grades = new ArrayList<>();
        grades.add(90.6);
        grades.add(50.7);
        grades.add(30.0);
        System.out.println(grades);

        grades.remove(2);
        System.out.println(grades);



        System.out.println(fruits.get(1));


        List<String> myStudents = new ArrayList<>();
        myStudents.add("Murad");
        myStudents.add("Khadija");
        myStudents.add("Halima");
        myStudents.add("Khadija");
        myStudents.add("Khadija");
        myStudents.add("Khadija");
        myStudents.add("Khadija");

        String mostActive = myStudents.get(0);
        System.out.println(mostActive);

        myStudents.set(2, "Murad");
        System.out.println(myStudents);

        System.out.println(myStudents.subList(3,5));


        System.out.println(myStudents.indexOf("Halima"));
        System.out.println(myStudents.lastIndexOf("Khadija"));



    }
}
