package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherHw3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();

        Pattern pattern = Pattern.compile("[A-Z][a-z]+");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println("Слово с заглавной буквы: " + matcher.group());
        }
    }
}
