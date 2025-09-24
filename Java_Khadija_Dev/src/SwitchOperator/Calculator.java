package SwitchOperator;

public class Calculator {
    public static void main(String[] args) {
        int a = 12;
        int b = 0;
        char op = '/';

        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '/':

            if (b == 0) {
                System.out.println("Делить нельзя!");
            } else{
                System.out.println(a / b);
            }
        }
    }
}
