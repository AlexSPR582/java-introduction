package by.epam.courses.module4.simple_classes.task3.incorrectMarkException;

public class IncorrectMarkException extends RuntimeException{
    public IncorrectMarkException(){}

    public IncorrectMarkException(String text) {
        super(text);
    }

    public IncorrectMarkException(Exception e) {
        super(e);
    }

    public IncorrectMarkException(String text, Exception e) {
        super(text, e);
    }
}
