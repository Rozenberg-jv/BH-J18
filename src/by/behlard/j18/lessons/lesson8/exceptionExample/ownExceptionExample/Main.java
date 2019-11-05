package by.behlard.j18.lessons.lesson8.exceptionExample.ownExceptionExample;

public class Main {
    public static void main(String[] args) {

        try {
            System.out.println(perimeter(5, -3));
        } catch (MyOwnInvalidParameterException e) {
            System.err.println(e.getMessage());
        }
    }

    private static int perimeter(int i1, int i2) throws MyOwnInvalidParameterException {

        if (i1 <= 0 || i2 <= 0)
            throw new MyOwnInvalidParameterException(i1, i2);

        int result = (i1 + i2) * 2;

        return result;
    }


}
