package by.behlard.j18.lessons.lesson7.interfacesexample;

public class Machine implements Workable {

    @Override
    public void work() {
        System.out.println("Work like a machine");
    }

    @Override
    public void defaultMethod(String param) {
        System.out.println("NO PARAM USAGE!! Machine default");
    }
}
