package Abstract;

public class MainSpaceShip {
    public static void main(String[] args) {
       CargoShip cr = new CargoShip();
       FighterShip fg = new FighterShip();
       ExplorerShip es = new ExplorerShip();
        System.out.println("cargo ship");
       cr.fly();
        System.out.println("fighter ship");
       fg.fly();
        System.out.println("explorer ship");
       es.fly();
    }
}
abstract class SpaceShip{
    String name;
    int speed;
    abstract void fly();
}
class CargoShip extends SpaceShip{
    @Override
    void fly(){
        System.out.println("Transports goods");
    }
}
class FighterShip extends SpaceShip{
    @Override
    void fly(){
        System.out.println("Attacks enemies");
    }
}
class ExplorerShip extends SpaceShip{
    @Override
    void fly(){
        System.out.println("Explores planets");
    }
}