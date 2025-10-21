package Abstract;

import java.util.Scanner;

public class Mainphone {
    public static void main(String[] args) {
     Phone phone1 = new Iphone();
     Scanner scanner = new Scanner(System.in);
     phone1.brand = "Apple";
     phone1.model = "17 pro max";
     phone1.storage = 512;
     phone1.userPhoto = "myphoto.png";
     phone1.sentMessage = scanner.nextLine();
     phone1.phoneInfo();
     phone1.sendMessage();
     phone1.takePhoto();
    }
}
abstract class Phone{
    String brand;
    String model;
    int storage;
    abstract void phoneInfo();
    abstract void sendMessage();
    abstract void takePhoto();
    String sentMessage;
    String userPhoto;
}
class Iphone extends Phone{
    @Override
    void phoneInfo(){
        System.out.println("Phone brand: " + brand);
        System.out.println("Phone model: " + model);
        System.out.println("Phone storage: " + storage);
    }
    @Override
    void sendMessage(){
        System.out.println("message was sent: " + sentMessage);
    }
    @Override
    void takePhoto(){
        System.out.println("User's photo: " + userPhoto);
    }
}