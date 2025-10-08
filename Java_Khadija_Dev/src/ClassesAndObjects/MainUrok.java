package ClassesAndObjects;

import java.util.Scanner;

public class MainUrok {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");
        String name = sc.nextLine();
        System.out.println(name);

        System.out.println("Your age: ");
        int age = sc.nextInt();
        System.out.println("my age is " + age);

        System.out.println("How much you have?");
        double money = sc.nextDouble();
        System.out.println("I have " + money + "$");

        sc.close();
    }
}
