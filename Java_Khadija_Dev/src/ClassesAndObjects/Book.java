package ClassesAndObjects;

import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MainBook book = new MainBook();
        System.out.println("Type price of book:");
        book.price = sc.nextDouble();
        sc.nextLine();
        System.out.println("Type name of book:");
        book.nameOfbook = sc.nextLine();
        System.out.println("Type name of author:");
        book.nameOfauthor = sc.nextLine();
    }
}
