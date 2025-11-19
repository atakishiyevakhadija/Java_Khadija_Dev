package Casting;

public class CastingTest {
    public static void main(String[] args) {
        int n = 700;
        double d = n;
        System.out.println(d);

        byte b = 120;
        short s = b;
        System.out.println(s);

        short c = 300;
        float f = c;
        System.out.println(f);

        long l = 690;
        double v = l;
        System.out.println(v);

        System.out.println("-------------");

        long o = 3876;
        short x = (short) o;
        System.out.println(x);

        double i = 45.7;
        float j = (float) i;
        System.out.println(j);

        float e = 46.2f;
        short q = (short) e;
        System.out.println(q);

        int w = 2345;
        byte m = (byte) w;
        System.out.println(m);
    }
}
