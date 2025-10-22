package Encapsulation;

public class MainPerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Khadija");
        System.out.println(person.getName());
        person.setAge(13);
        System.out.println(person.getAge());
        person.setSurname("Atakishiyeva");
        System.out.println(person.getSurname());
        person.setHeight(157);
        System.out.println(person.getHeight());
        person.setBalance(13);
        System.out.println(person.getBalance());
        person.setHairColor("brown");
        System.out.println(person.getHairColor());
    }
}
