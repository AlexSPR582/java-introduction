package by.epam.courses.module4.aggregation_and_composition.task1.sentence;

public class IncorrectSentenceException extends RuntimeException {
    public IncorrectSentenceException() {}

    public IncorrectSentenceException(String str) {
        super(str);
    }

    public IncorrectSentenceException(Exception e) {
        super(e);
    }

    public IncorrectSentenceException(String str, Exception e) {
        super(str, e);
    }
}
