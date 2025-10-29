package stringmethods;

public class Test {
    public static void main(String[] args) {
        String s0 = "name";
        System.out.println(s0.length());
        System.out.println("---------------------");
        String s1 = "Hello";
        char[] letter = s1.toCharArray();
        System.out.println(letter[3]);
        System.out.println("--------------------");
        String s2 = "World";
        String s3 = "Hello";
        System.out.println(s2.equals(s3));
        System.out.println(s2.equalsIgnoreCase(s3));
        System.out.println("--------------------");
        System.out.println(s2.startsWith("E"));
        System.out.println(s3.endsWith("o"));
        System.out.println("-------------");
        System.out.println(s3.substring(2,4));
        System.out.println(s2.replace("W", "Y"));
        System.out.println(s3.indexOf("o"));
        System.out.println(s3.regionMatches(3,s2,1,2));
        System.out.println("------------------");
        String s4 = "   Java   ";
        System.out.println(s4.trim());
        System.out.println("-----------------");
        String s5 = "False";
        System.out.println(s5.toLowerCase());
        System.out.println(s5.toUpperCase());
    }
}
