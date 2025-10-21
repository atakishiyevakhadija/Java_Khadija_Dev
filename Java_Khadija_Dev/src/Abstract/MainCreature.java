package Abstract;

public class MainCreature {
    public static void main(String[] args) {
      Elf elf = new Elf();
      Wizard wi = new Wizard();
      Dragon dr = new Dragon();
      String[] creature = {"Elf", "Wizard", "Dragon"};
        System.out.println(creature[0]);
        elf.doMagic();
        System.out.println(creature[1]);
        wi.doMagic();
        System.out.println(creature[2]);
        dr.doMagic();
    }
}
abstract class Creature{
   abstract void doMagic();
}
class Elf extends Creature{
    @Override
    void doMagic(){
        System.out.println("Encourage plants to grow");
    }
}
class Wizard extends Creature{
    @Override
    void doMagic(){
        System.out.println("Turns to stone");
    }
}
class Dragon extends Creature{
    @Override
    void doMagic(){
        System.out.println("Breathes fire");
    }
}