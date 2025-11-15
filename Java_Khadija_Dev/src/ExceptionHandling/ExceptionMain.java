package ExceptionHandling;

import java.util.Scanner;

public class ExceptionMain {
    public static void main(String[] args) {
        int a = 4;
        int b = 9;

        try{
            System.out.println(a/b);
        } catch (Exception e) {
            if (b == 0) {
                throw new ArithmeticException("На ноль делить нельзя");
            }
        }
        finally {
            System.out.println("Работа завершена");
        }

        Scanner sc = new Scanner(System.in);
        try{
            int[] mass = {6,90,78,56};
            System.out.println(mass[sc.nextInt()]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Такого индекса не существует!");
        }

        try {
            int[] mass = {7,45,87};
            System.out.println(mass[4]);
            int x = 9;
            int y = 0;
            System.out.println(x / y);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вне пределов массива!");
        } catch (ArithmeticException e){
            System.out.println("На ноль делить нельзя!!!");
        } finally{
            System.out.println("Обработка завершена");
        }


    }
}
