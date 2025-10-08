package Loops;

public class Project_continue {
    public static void main(String[] args) {
        System.out.println("Continue");
        for (int i = 1; i < 25; i++){
            if (i % 4 == 0) continue;
            System.out.println(i);
        }
        System.out.println("Break");
        for (int j = 1; j <= 70; j++) {
            if (j == 30) break;
            System.out.println(j);
        }
    }
}
