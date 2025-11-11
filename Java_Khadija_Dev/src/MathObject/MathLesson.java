package MathObject;

import java.util.Random;

public class MathLesson {
    public static void main(String[] args) {
        Random rnd = new Random();
        int n1 = rnd.nextInt(100) + 1;
        System.out.println("random number: " + n1);
        int n2 = rnd.nextInt((100 - 50) + 1) + 50;
        System.out.println("random number po 10: " + n2);

        System.out.println("abs: " + Math.abs(-7));
        System.out.println("min: " + Math.min(-1, 9));
        System.out.println("max: " + Math.max(10, 100));
        System.out.println("power: " + Math.pow(5,5));
        System.out.println("square root" + Math.sqrt(25));
        System.out.println("round: " + Math.round(0.7));
        System.out.println("floor: " + Math.floor(0.7));
        System.out.println("ceil: " + Math.ceil(0.7));
        System.out.println("random: " + Math.random());

    }
}
