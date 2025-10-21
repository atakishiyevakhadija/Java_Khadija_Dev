package Abstract;

import java.util.Scanner;

public class MyPhone {
    public static void main(String[] args) {
        Device phone = new Phones();
        Scanner sc = new Scanner(System.in);
        phone.brand = "Apple";
        phone.model = "17 air";
        phone.storage = 1000;
        System.out.println("Write price");
        phone.price = sc.nextDouble();
        System.out.println("Write percent");
        phone.percent = sc.nextDouble();
        sc.nextLine();
        phone.discount();
        phone.phoneInfo();
        System.out.println("Write a message");
        phone.text = sc.nextLine();
        phone.writeText();
    }
}
abstract class Device{
    String brand;
    String model;
    int storage;
    double price;
    double percent;
    String text;
    abstract void phoneInfo();
    abstract void writeText();
    void discount(){
        price -= (price * percent / 100);
        System.out.println("Новая цена! " + price);
    }
}
class Phones extends Device{
    @Override
    void phoneInfo(){
        System.out.println("Phone brand: " + brand);
        System.out.println("Phone model: " + model);
        System.out.println("Phone storage: " + storage);
    }
    @Override
    void writeText(){
        System.out.println("Text was written: " + text);
    }
}