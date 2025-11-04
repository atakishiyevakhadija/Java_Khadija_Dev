package OuterAndInner;


public class CalculatorMain {
    public static void main(String[] args) {
        new Calculator().calculator();
    }
}
class Calculator{

   void calculator(){
       MathUtils mu = new MathUtils();
       mu.sum(34,23);
       mu.multiplication(56,3);
   }

    class MathUtils{
        void sum(int a, int b){
            System.out.println("Sum: " + (a + b));
        }
        void multiplication(int a, int b){
            System.out.println("Multiplication: " + (a * b));
        }
    }
}