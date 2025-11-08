package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String hello1 = "Hello";
        String hello2 = "hello";
        Pattern pattern = Pattern.compile(hello2);
        Matcher matcher = pattern.matcher(hello1);
        System.out.println(matcher.matches());

    }
}