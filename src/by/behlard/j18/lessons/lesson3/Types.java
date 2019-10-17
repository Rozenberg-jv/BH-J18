package by.behlard.j18.lessons.lesson3;

public class Types {
    public static void main(String[] args) {

        int a = 14;

        char c = (char) a;

        System.out.println((char) (c - 26));
        System.out.println((int) 'A');
        System.out.println((int) 'Z');
        System.out.print("f");
        System.out.print("f");
        System.out.println();

        String result;
        /*if (a >= 97)
            result = "small letter";
        else
            result = "big letter";

        System.out.println(result);*/

        result = (a >= 97 && a <= 123) ? "small letter" :
                (a >=65 && a <= 90) ? "big letter" : "not english alphabet letter";

        System.out.println(result);
    }
}
