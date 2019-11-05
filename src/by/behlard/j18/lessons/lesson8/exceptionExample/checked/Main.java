package by.behlard.j18.lessons.lesson8.exceptionExample.checked;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("C:/nofile.no");

        method1(file);

        System.out.println("end of program");
    }

    private static void method1(File file) throws IOException {

        OutputStream stream = new FileOutputStream(file);

        stream.write(1);

        System.out.println("end of method1");
    }
}
