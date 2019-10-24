package by.behlard.j18.lessons.lesson5.try3;

public class Counter {

    private static int counter;

    private String str;

    public Counter(String str) {
        counter = -5;
        this.str = str;
    }

    public void inc() {
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public String toString() {
        return "Counter " + str + " " + counter;
    }
}
