package by.behlard.j18.lessons.lesson7.abstractExample;

public class AbstractExample {
    public static void main(String[] args) {

//        AbstractWorker worker = new FactoryWorker("Vasily", 25);

        AbstractWorker worker = new OfficeWorker("Ignat", 55);

        workingDay(worker);
    }

    public static void workingDay(AbstractWorker worker) {

        worker.work();
        worker.eat("fish");
        worker.work();
    }


}
