package by.behlard.j18.lessons.lesson7.interfacesexample;

public interface Workable {

    int defaultAge = 5;

    void work();

    default void defaultMethod(String param) {
        System.out.println("param: " + makeString(param));
    }

    static void staticMethod() {
        System.out.println("staticMethod");
    }

    private String makeString(String lower) {
        return lower.toUpperCase();
    }
}
