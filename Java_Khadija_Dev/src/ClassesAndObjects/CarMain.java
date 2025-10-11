package ClassesAndObjects;

import java.util.Scanner;

public class CarMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car car = new Car();
        System.out.println("Type car's brend:");
        car.brendName = sc.nextLine();
        System.out.println("Type car's color:");
        car.color = sc.nextLine();
        System.out.println("Type car's max speed:");
        car.maxSpeed = sc.nextInt();
        System.out.println("Type car's price:");
        car.price = sc.nextDouble();

        System.out.println("Car Info");
        car.car();
        System.out.println("Turn on car");
        car.turnOnCar();
    }
}
