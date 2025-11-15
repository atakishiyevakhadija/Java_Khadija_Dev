package ExceptionHandling;

public class ExceptionTest {
    public static void main(String[] args) {
       int x = 4;
       int y = 9;

       try{
           System.out.println(x/y);
       } catch (Exception e) {
           if (y == 0) {
               throw new ArithmeticException("На ноль делить нельзя");
           }
       }
       finally {
           System.out.println("Always runs");
       }


        try{
            int[] mass = {6,90,78};
            System.out.println(mass[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Вне пределов массива!");
        }
        finally {
            System.out.println("Always runs");
        }

        int c = -7;
        try{
            System.out.println(c);
        } catch (Exception e) {
            if(c >= 0){
                System.out.println("Positive");
            } else if (c < 0){
                throw new ArithmeticException("Negative");
            }
        }
        finally {
            System.out.println("Always runs");
        }
    }
}
