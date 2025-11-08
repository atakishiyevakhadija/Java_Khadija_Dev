package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMain {
    // \\d - любое число
    // "A.." - буква А и любые два символа
    // "hello|hi" - hello либо hi

    public static void main(String[] args) {
        Pattern pattern1 = Pattern.compile("Java");
        Matcher matcher1 = pattern1.matcher("I know Java avery well!");
        boolean found = matcher1.find();
        System.out.println("Есть ли совпадение: " + found);
        boolean isWord = Pattern.matches("Python","Python is Python");
        System.out.println(isWord);


        String [] texts = {"HelloWorld12", "Hi Guys", "Java_Is_easy", "TestJAVA2025"};
        for (String t : texts){
            boolean result = t.matches("[A-Za-z0-9]+");
            System.out.println(t + " - " + result);
        }
    }
}
