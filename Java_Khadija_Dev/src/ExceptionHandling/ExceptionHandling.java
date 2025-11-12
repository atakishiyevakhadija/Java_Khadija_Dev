package ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        if (age >= 18){
            System.out.println("You can enter");
        } else{
            throw new ArithmeticException("you are not allowed");
        }


       try{
          int x = 10;
          int y = 0;
           System.out.println(x/y);
       } catch (ArithmeticException e) {
           System.out.println("На ноль делить нельзя");
       } finally {
           System.out.println("Always runs!!");
       }

        try {
            int[] mass = {1,2,3};
            System.out.println(mass[5]);
            int a = 5;
            int b = 0;
            System.out.println(a / b);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вне пределов массива!");
        } catch (ArithmeticException e){
            System.out.println("на ноль делить нельзя!!!");
        } finally {
            System.out.println("Always runs!!");
        }


    }
}
