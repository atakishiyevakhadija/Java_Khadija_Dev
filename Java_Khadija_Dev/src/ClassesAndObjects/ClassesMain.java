package ClassesAndObjects;

import java.util.Scanner;

public class ClassesMain {
    public static void main(String[] args) {
        ClassesAndObjects cao = new ClassesAndObjects();
        Scanner scanner = new Scanner(System.in);
        cao.a = scanner.nextInt();
        cao.b = scanner.nextInt();
        cao.add();
        cao.subs();

        ClassesAndObjects cao2 = new ClassesAndObjects();
        cao2.a = scanner.nextInt();
        cao2.b = scanner.nextInt();
        cao2.add();
        cao2.subs();

    }
}
