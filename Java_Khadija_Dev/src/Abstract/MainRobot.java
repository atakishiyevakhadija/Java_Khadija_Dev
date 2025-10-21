package Abstract;

public class MainRobot {
    public static void main(String[] args) {
         CleanerBot cl = new CleanerBot();
         ChefBot ch = new ChefBot();
         GuardBot gu = new GuardBot();
        String [] name = {"Cleaner robot", "Chef robot", "Guard robot"};
        cl.sayHello();
        System.out.println(name[0]);
        cl.doTask();
        ch.sayHello();
        System.out.println(name[1]);
        ch.doTask();
        gu.sayHello();
        System.out.println(name[2]);
        gu.doTask();
    }
}
abstract class Robot {
    void sayHello(){
        System.out.println("Hello");
   }
  abstract void doTask();
}
class CleanerBot extends Robot{
   @Override
    void doTask(){
       System.out.println("Cleaning the room");
   }
}
class ChefBot extends Robot{
    @Override
    void doTask(){
        System.out.println("Cooking the food");
    }
}
class GuardBot extends Robot{
    @Override
    void doTask(){
        System.out.println("Guard the house");
    }
}