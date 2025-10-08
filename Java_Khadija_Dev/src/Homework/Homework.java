package Homework;

public class Homework {
    public static void main(String[] args) {
        System.out.println("1st exercise");
        for (int x = 1; x <= 10; x++){
            System.out.println(x);
        }

        System.out.println("2nd exercise");

        int a = 10;
        int b = 5;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);

        if (b == 0) {
            System.out.println("Делить нельзя!");
        } else{
            System.out.println(a / b);
        }

        System.out.println("3rd exercise");
        MethodHomework mh = new MethodHomework();
        mh.a = 8;
        mh.b = 89;
        mh.sum();

        System.out.println("4th exercise");

        for (int y = 1; y <= 10; y++){
            if (y == 5) break;
            System.out.println(y);
        }

        System.out.println("5th exercise");

        for (int i = 1; i <= 10; i++){
            if (i == 5) continue;
            System.out.println(i);
        }
    }
}
