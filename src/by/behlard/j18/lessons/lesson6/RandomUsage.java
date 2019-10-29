package by.behlard.j18.lessons.lesson6;

import java.util.Random;

public class RandomUsage {
    public static void main(String[] args) {

        double random = Math.random();
        System.out.println(random);

        Random randomObject = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(randomObject.nextInt(10));
        }
    }
}
