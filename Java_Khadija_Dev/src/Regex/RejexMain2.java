package Regex;

import java.util.Scanner;

public class RejexMain2 {
    public static void main(String[] args) {
        System.out.println("a".matches("a+"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input: ");
        String word = sc.nextLine();

        if (word.matches("[A-Z][a-z][0-9]+")) {
            System.out.println("matches");
        } else {
            System.out.println("does not match");
        }
    }
}