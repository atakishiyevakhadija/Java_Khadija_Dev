package ClassesAndObjects;

import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        Test t = new Test();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        t.name = scanner.nextLine();
        System.out.println(t.name);
        t.myName();

        System.out.println("What is your surname?");
        t.surname = scanner.nextLine();
        System.out.println(t.surname);
        t.surname();

        System.out.println("Your birthday: ");
        t.bday = scanner.nextLine();
        System.out.println(t.bday);
        t.bday();


        System.out.println("Your location: ");
        t.location = scanner.nextLine();
        System.out.println(t.location);
        t.location();

        System.out.println("Your hobby: ");
        t.hobby = scanner.nextLine();
        System.out.println(t.hobby);
        t.hobby();

        System.out.println("Your age: ");
        t.age = scanner.nextInt();
        System.out.println(t.age);
        t.age();


        System.out.println(t.name);
        System.out.println(t.surname);
        System.out.println(t.bday);
        System.out.println(t.age);
        System.out.println(t.location);
        System.out.println(t.hobby);

        scanner.close();
    }
}
