package ifelse;

public class MainUser {
    public static void main(String[] args) {
        boolean isActive = false;
        if (isActive) {
            System.out.println("Active User");
        } else if (!isActive) {
            System.out.println("delete the user");
        } else {
            System.out.println("there is no such a User");
        };

        String name = "Khadija";
        int age = 13;
        String city = "Baku";
        String fav_book = "Garry Potter";

        System.out.println(name + " " + age + " " + city + " " + fav_book);

        if (age < 18) {
            System.out.println("Вы несовершеннолетний");
        } else if (age >= 18){
            System.out.println("Вы совершеннолетний");
        } else if (age > 50){
            System.out.println("Вы находитесь в возрасте мудрости!");
        }

        boolean from_moskva = false;
        boolean from_sanktpeterburq = false;
        if (age < 18 && from_moskva){
            System.out.println("Вы несовершеннолетний, но из Москвы");
        } else if (age > 30 && from_sanktpeterburq) {
            System.out.println("Вы старше 30 лет и не из Питера");
        }

        boolean voyna_i_mir = false;
        boolean harry_potter = true;
        if (voyna_i_mir){
            System.out.println("Вы любите класскику!");
        } else if (harry_potter) {
            System.out.println("Вы любите магию!");
        } else{
            System.out.println("У вас хороший вкус в книгах!");
        }
    }
}
