package by.behlard.j18.lessons.lesson7.interfacesexample;

public class InterfaceExample {
    public static void main(String[] args) {

        System.out.println(Workable.defaultAge);

        Workable workable = new Worker();
        workable.work();
        workable.defaultMethod("Default param");
        workable = new Machine();
        workable.work();
        workable.defaultMethod("lalala");

        Workable.staticMethod();
    }
}
