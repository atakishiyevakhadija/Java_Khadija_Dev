package Casting;

public class CastingHw {
    public static void main(String[] args) {
        int a = 25;
        double b = a;
        System.out.println(b);
        // Преобразование произошло автоматически потому что double больше int и это неявное преобразование
        double x = 7.9;
        int y = (int)x;
        System.out.println(y);
        // Потому что int не принимает дробные значения
        byte r = 90;
        byte f = 60;
        // byte c = r + f; Ошибка потому что не может вместить 150 максимально можно только 127
        int e = r + f;
        System.out.println(e);

        short s = 1000;
        byte d = (byte) s;
        System.out.println(d);
        // Значение не равняется 1000 потому что происходит потеря данных из-за того что не вмещается
        // и превращается в binary потом он выбирает последние 8 чисел и превращает их в decimal
        char ch = 'D';
        int h = ch;
        System.out.println(h);

        char ch1 = 'A';
        int h1 = ch1;
        System.out.println(h1);

        char ch2 = 'Z';
        int h2 = ch2;
        System.out.println(h2);

        char ch3 = 'a';
        int h3 = ch3;
        System.out.println(h3);

        char ch4 = '0';
        int h4 = ch4;
        System.out.println(h4);

        int n = 66;
        char g = (char) n;
        System.out.println(g);

        int n1 = 70;
        char g1 = (char) n1;
        System.out.println(g1);

        int n2 = 71;
        char g2 = (char) n2;
        System.out.println(g2);

        int n3 = 72;
        char g3 = (char) n3;
        System.out.println(g3);

        int n4 = 97;
        char g4 = (char) n4;
        System.out.println(g4);

        int n5 = 98;
        char g5 = (char) n5;
        System.out.println(g5);

        String t = "456";
        int v = Integer.parseInt(t) + 100;
        System.out.println(v);
        // "456" и 456 отличаются тем что первый string а второй число

        int j = 5;
        int o = 2;
        double k = (double) j / o;
        System.out.println(k);

        long big = 123456;
        short small = (short) big;
        System.out.println(small);
        // Значение не равняется 123456 потому что происходит потеря данных из-за того что не вмещается
        // и превращается в binary потом он выбирает последние 8 чисел и превращает их в decimal

        String m = "99";
        double u = Integer.parseInt(m) * 1.5;
        System.out.println(u);
        int z = (int) u;
        System.out.println(z);
    }
}
