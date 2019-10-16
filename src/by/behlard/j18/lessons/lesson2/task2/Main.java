package by.behlard.j18.lessons.lesson2.task2;

public class Main {
    public static void main(String[] args) {

        Main m1 = new Main();
        Main m2 = new Main();

        System.out.println(m1);
        System.out.println(m2);

        m2 = m1;

        System.out.println(m2);

    }
}
