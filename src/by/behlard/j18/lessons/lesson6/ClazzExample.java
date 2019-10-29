package by.behlard.j18.lessons.lesson6;

public class ClazzExample {
    public static void main(String[] args) {

        ClazzExample clazzExample = new ClazzExample();

        Class<? extends ClazzExample> clazz = clazzExample.getClass();

    }
}
