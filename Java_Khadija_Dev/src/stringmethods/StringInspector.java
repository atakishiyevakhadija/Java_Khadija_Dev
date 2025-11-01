package stringmethods;

import java.util.Scanner;

public class StringInspector {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write text");
        String s0 = sc.nextLine();
        System.out.println(s0);
        System.out.println(s0.length());
        System.out.println(s0.toUpperCase());
        System.out.println(s0.toLowerCase());
        System.out.println("Write text with spaces");
        String s1 = sc.nextLine();
        System.out.println(s1.trim());
        System.out.println("Write text");
        String s2 = sc.nextLine();
        char[] text = s2.toCharArray();
        System.out.println(text);
        System.out.println("Write text with numbers");
        String s3 = sc.nextLine();
        char[] num = s3.toCharArray();
        System.out.println(num);
        System.out.println("Write text with spaces");
        String s4 = sc.nextLine();
        char[] space = s4.toCharArray();
        System.out.println(space);
        System.out.println("Write text");
        String s5 = sc.nextLine();
        System.out.println(s5.indexOf("a"));
        System.out.println(s5.lastIndexOf("e"));
        System.out.println("Write text");
        String s6 = sc.nextLine();
        System.out.println("Write which symbol you want to change to which");
        System.out.println(s6.replace(sc.nextLine(),sc.nextLine()));
        System.out.println("Write text");
        String s7 = sc.nextLine();
        System.out.println(s7.startsWith("S"));
        System.out.println(s7.endsWith("A"));
        System.out.println("Write indexes");
        System.out.println(s5.substring(sc.nextInt(), sc.nextInt()));
        System.out.println(s3.regionMatches(1,s4,2,4));
    }
}
