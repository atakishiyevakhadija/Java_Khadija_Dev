package Extention;

public class Parent {
    String name = "Ali";
    String surname = "Aliyev";
    String eyeColor = "Blue";

    void parentInfo(){
        System.out.println(name);
        System.out.println(surname);
        System.out.println(eyeColor);
    }

}

class Child extends Parent{
    String name = "Elnar";
    void childInfo(){
        System.out.println(name);
        System.out.println(surname);
        System.out.println(eyeColor);
    }

    public static void main(String[] args) {
        Child child = new Child();
        Parent parent = new Parent();
        System.out.println("Info about parent");
        parent.parentInfo();
        System.out.println("Info about child");
        child.childInfo();
    }
}
