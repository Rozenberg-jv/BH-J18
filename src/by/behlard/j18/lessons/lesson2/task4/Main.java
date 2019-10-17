package by.behlard.j18.lessons.lesson2.task4;

public class Main {
    public static void main(String[] args) {

        int a = 60;

        if (a < 19) {
            System.out.println(a);
        } else if (a >= 20 && a < 60) {
            System.out.println(a * 2);
        } else {
            System.out.println("higher than 60");
        }
    }
}
