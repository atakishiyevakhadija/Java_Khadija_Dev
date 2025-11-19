package Casting;

public class CastingMain {
    public static void main(String[] args) {
        int a = 200;
        double d = a;

        System.out.println(d);

        float f = 100.1f;
        long l = (long) f;

        System.out.println(l);

        byte b = 100;
        short s = b;

        System.out.println(s);

        System.out.println("------------------------");

        short s1 = 1000;
        byte b1 = (byte)s1;

        System.out.println(b1);

        char c = '~';
        int i = c + 10;
        short s2 = (short) i;

        System.out.println(s2);



    }
}
