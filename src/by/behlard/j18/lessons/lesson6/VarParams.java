package by.behlard.j18.lessons.lesson6;

public class VarParams {
    public static void main(String[] args) {

        print(1);
        print(2, "two");
        print(3, "two", "three");
        print(4, "two", "three", "four");
        print(5, "two", "two", "three", "four", "two", "three",
                "four", "two", "three", "four", "two", "three",
                "four", "two", "three", "four", "two", "three",
                "four");

    }

    private static void print(int a, String... strings) {
        System.out.println(a);
        for (String s : strings) {
            System.out.println(s);
        }
        System.out.println();
    }

}
