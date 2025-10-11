package ClassesAndObjects;

import java.util.Scanner;

public class MainStudent {
    public static void main(String[] args) {
        Student st = new Student();
        st.setId(1);
        System.out.println( st.setId(1));
        st.findSum(21, 0);




        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Type student id:");
        student.id = sc.nextInt();
        sc.nextLine();
        System.out.println("Type student name:");
        student.name = sc.nextLine();
        System.out.println("Type student surname:");
        student.surname = sc.nextLine();
        System.out.println("Type student Num of lessons he/she took:");
        student.NumOfLessons = sc.nextInt();
        student.isActive = true;

        System.out.println("Show all data");
        student.studentInfo();
        student.IsActiveOrNo();
    }
}
