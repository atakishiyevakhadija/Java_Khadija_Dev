package Abstract;

public class MainRide {
    public static void main(String[] args) {
       RollerCoaster ri = new RollerCoaster();
       FerrisWheel fe = new FerrisWheel();
       HauntedHouse ha = new HauntedHouse();
       String[] list = {"Roller coaster", "Ferris wheel", "Haunted house"};
       ri.startRide();
        System.out.println(list[0]);
        ri.enjoy();
        System.out.println(list[1]);
        fe.enjoy();
        System.out.println(list[2]);
        ha.enjoy();
    }
}
abstract class Ride{
    void startRide(){
        System.out.println("Start ride");
    }
    abstract void enjoy();
}
class RollerCoaster extends Ride{
    @Override
    void enjoy(){
        System.out.println("Roller coaster has extreme");
    }
}
class FerrisWheel extends Ride{
    @Override
    void enjoy(){
        System.out.println("Ferris wheel is on top");
    }
}
class HauntedHouse extends Ride{
    @Override
    void enjoy(){
        System.out.println("Haunted house scary");
    }
}