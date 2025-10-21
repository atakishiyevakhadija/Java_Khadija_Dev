package Abstract;

public class MainHero {
    public static void main(String[] args) {
       Warrior wa = new Warrior();
       Archer ar = new Archer();
       Mage ma = new Mage();
       String[] list = {"Warrior", "Archer", "Mage"};
        System.out.println(list[0]);
        wa.attack();
        System.out.println(list[1]);
        ar.attack();
        System.out.println(list[2]);
        ma.attack();
    }
}
abstract class Hero{
    abstract void attack();
}
class Warrior extends Hero{
    @Override
    void attack(){
        System.out.println("Attacks with a sword");
    }
}
class Archer extends Hero{
    @Override
    void attack(){
        System.out.println("Shoots a bow");
    }
}
class Mage extends Hero{
    @Override
    void attack(){
        System.out.println("Uses a spell");
    }
}