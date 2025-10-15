package Poliformizm;

public class MainVehicle {
    public static void main(String[] args) {
        Vehicle vehicles = new Vehicle();
        vehicles.brand = "audi";
        vehicles.model = "RsB";
        vehicles.numDoor = 4;
        vehicles.speed = 300;
        vehicles.price = 100000;
        vehicles.CarInfo();

        Bmw bmw1 = new Bmw();
        bmw1.brand = "M5";
        bmw1.model = "F90";
        bmw1.numDoor = 4;
        bmw1.speed = 340;
        bmw1.price = 140000;
        bmw1.CarSpeed();
        bmw1.CarPrice();
        bmw1.CarInfo();
    }
}
class Vehicle {
    int numDoor;
    int speed;
    double price;
    String brand;
    String model;
    void CarSpeed(){
        System.out.println("Car's max speed");
    }
    void CarPrice(){
        System.out.println("Write price of the car");
    }
    void CarInfo(){
        System.out.println(brand);
        System.out.println(model);
        System.out.println(numDoor);
        System.out.println(speed);
        System.out.println(price);
    }
}

class Bmw extends Vehicle{
    @Override
    void CarSpeed(){
        System.out.println(300 + "km/h");
    }
    @Override
    void CarPrice(){
        System.out.println("price for this car is: " + price);
    }
}
class Mercedes extends Vehicle {
    @Override
    void CarSpeed() {
        System.out.println(300 + "km/h");
    }

    @Override
    void CarPrice() {
        System.out.println("price for this car is: " + price);
    }
}