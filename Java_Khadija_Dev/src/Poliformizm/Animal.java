package Poliformizm;

public class Animal {
    void sound(){
        System.out.println("Animal sound");
    }
}
class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog is barking");
    }
}
class Dark extends Animal{
    @Override
    void sound(){
        System.out.println("Dark is darking");
    }
}