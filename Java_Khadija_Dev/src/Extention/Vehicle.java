package Extention;

public class Vehicle {
    String brand;
    int year;
    void drive(){
        System.out.println("Vehicle is moving");
    }
}
class Car extends Vehicle {
    String doors;

    void drive() {
        System.out.println("Car is driving");
    }
}
    class Bike extends Vehicle {
        String type;

        void drive() {
            System.out.println("Bike is driving");
        }

    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Car car = new Car();
        Bike bike = new Bike();
        vehicle.drive();
        car.drive();
        bike.drive();
    }
}
