package ClassesAndObjects;

import org.w3c.dom.ls.LSOutput;

public class ClassesAndObjects {
     int a;
     int b;
        void add(){
            System.out.println("Сумма");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("sum = " + (a + b));
        }

        void subs(){
            System.out.println("Вычитание");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("sub = " + (a - b));
        }

        void multiplication(){
            System.out.println("Умножение");
            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("multiplication = " + (a * b));
        }

        void division(){
            System.out.println("Деление");

            System.out.println("a = " + a);
            System.out.println("b = " + b);
            System.out.println("division = " + (a / b));
        }

}
