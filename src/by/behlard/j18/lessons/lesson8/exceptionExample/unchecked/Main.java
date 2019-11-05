package by.behlard.j18.lessons.lesson8.exceptionExample.unchecked;

public class Main {

    public static void main(String[] args) {

        System.out.println(getElementByIndex(new String[]{"0", "1", "2"}, -1));
        try {
            System.out.println(getField(null));
        } catch (NullPointerException e) {
            System.out.println("We have NPE");
        } finally {
            System.out.println("check");
        }

    }

    private static String getElementByIndex(String[] strings, int i) {

        String string;

        try {
            string = strings[i];
        } catch (IndexOutOfBoundsException e) {
            e.printStackTrace();

            return "ERROR";
        } finally {
            System.out.println("FINALLY BLOCK");
        }

        return string;
    }

    private static int getField(ExampleWithField o) throws NullPointerException {

        return o.a;
    }


}
