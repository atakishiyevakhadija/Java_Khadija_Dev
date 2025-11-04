package OuterAndInner;

public class GreetingMain {
    public static void main(String[] args) {
          Greeting gt = new Greeting();
          gt.showMessage();
    }
}
class Greeting {
    String local = "локального класса!";
    void showMessage(){
        Message ms = new Message();
        ms.print();
    }
    class Message{
        void print(){
            System.out.println("Привет из " + local);
        }
    }
}