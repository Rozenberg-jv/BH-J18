package by.behlard.j18.lessons.lesson5.try1;

import by.behlard.j18.lessons.lesson5.try2.Example;

public class Main {

    public static void main(String[] args) {

        Person person = new Person();

        person.eat();
        person.eat("fish");
        person.eat("donut", 5);
        person.eat(10, "breakfast");

        java.util.Date dateUtil = new java.util.Date();
        java.sql.Date dateSql = new java.sql.Date(1);

        Example example = new Example();

        //        example.def;
//        System.out.println(example.prot);
        System.out.println(example.pub);

    }
}
