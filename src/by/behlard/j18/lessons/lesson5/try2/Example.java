package by.behlard.j18.lessons.lesson5.try2;

public class Example {

    private int priv = 0;

    int def = 1;

    protected int prot = 2;

    public int pub = 3;

    public void print() {
        System.out.println(priv++);
        System.out.println(def);
    }
}
