package ClassesAndObjects;

public class Car {
    String brendName;
    String color;
    int maxSpeed;
    double price;

    void car(){
        System.out.println("brend name" + " " + brendName);
        System.out.println("color" + " " + color);
        System.out.println("max speed" + " " + maxSpeed);
        System.out.println("price" + " " + price);
    }
    void turnOnCar(){
        System.out.println("Машина завелась");
    }
}
