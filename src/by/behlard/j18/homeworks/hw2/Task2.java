package by.behlard.j18.homeworks.hw2;

public class Task2 {
    public static void main(String[] args) {

        int r = 5;
        double pi = 3.14;

        if (r <= 0) {
            System.out.println("Error");
        } else {
            System.out.println("length: " + r * pi * 2);
            System.out.println("square: " + Math.pow(r, 2) * Math.PI);
        }

    }
}
