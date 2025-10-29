package Encapsulation;

public class BankSystem {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Khadija");
        System.out.println(user.getName());
        user.setSurname("Atakishiyeva");
        System.out.println(user.getSurname());
        user.setPhoneNumber(556295033);
        System.out.println(user.getPhoneNumber());
        user.setEmail("khadija@gmail.com");
        System.out.println(user.getEmail());
        user.setCardNumber("787784972678794445");
        System.out.println(user.getCardNumber());
        user.setBirthdate("25.06.12");
        System.out.println(user.getBirthdate());
        user.setPassword(748);
        System.out.println(user.getPassword());
    }
}
