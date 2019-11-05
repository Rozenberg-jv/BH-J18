package by.behlard.j18.lessons.lesson8.try1.exceptions;

public class InvalidFuelParameterException extends RuntimeException {
    public InvalidFuelParameterException(String s) {
        super(s);
    }
}
