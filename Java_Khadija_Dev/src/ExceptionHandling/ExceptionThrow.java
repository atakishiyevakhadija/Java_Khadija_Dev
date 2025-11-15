package ExceptionHandling;

import java.util.Scanner;

public class ExceptionThrow {
    static void checkAge(int age) throws Exception{

        if(age < 18) {
            throw new Exception("Вам нет 18");
        } else if(age >= 18){
            System.out.println("Добро пожаловать");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println("Введите возраст");
            checkAge(sc.nextInt());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
