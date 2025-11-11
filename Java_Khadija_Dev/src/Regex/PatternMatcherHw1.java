package Regex;

import java.util.Scanner;

public class PatternMatcherHw1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
         if (word.matches("[A-Za-z]+")){
             System.out.println("It's word");
         } else {
             System.out.println("It's not word");
         }
    }
}
