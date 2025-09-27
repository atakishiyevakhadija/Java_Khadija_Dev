package SwitchOperator;

public class RatingSystem {
    public static void main(String[] args) {
        int grade = 5;
        switch (grade) {
            case 5:
                System.out.println("Great");
            case 4:
                System.out.println("Good");
            case 3:
                System.out.println("Satisfactorily");
            case 2:
                System.out.println("Unsatisfactorily");
            default:
                System.out.println("Incorrect assessment");
        }
    }
}
