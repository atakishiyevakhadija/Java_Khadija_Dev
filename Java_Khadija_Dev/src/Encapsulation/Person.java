package Encapsulation;

public class Person {
    private String name;
    private int age;
    private String surname;
    private int height;
    private int balance;
    private String hairColor;

    public String getName(){
   return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public String getSurname(){
        return surname;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public int getHeight(){
        return height;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public int getBalance(){
        return balance;
    }
    public void setBalance(int balance){
        this.balance = balance;
    }
    public String getHairColor(){
        return hairColor;
    }
    public void setHairColor(String hairColor){
        this.hairColor = hairColor;
    }
}
