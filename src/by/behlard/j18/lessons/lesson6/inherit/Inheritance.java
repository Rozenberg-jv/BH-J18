package by.behlard.j18.lessons.lesson6.inherit;

public class Inheritance {
    public static void main(String[] args) {

        Person person1 = new Person("Vasily", 35, 74.1);

        person1.eat("fish");
        System.out.println(person1.growOld());

        Worker worker1 = new Worker("Ivan", 27, 63.9, 500);

        worker1.work();
        worker1.eat("Meet");
        System.out.println(worker1.growOld());

        System.out.println();
        Person worker2 = new Worker("Ivan", 27, 63.9, 500);
        worker2.eat("potato");

        System.out.println(worker2.growOld());
        ((Worker)worker2).work();

    }
}
