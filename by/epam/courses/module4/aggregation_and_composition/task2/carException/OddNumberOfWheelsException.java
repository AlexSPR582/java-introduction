package by.epam.courses.module4.aggregation_and_composition.task2.carException;

public class OddNumberOfWheelsException extends RuntimeException{
    public OddNumberOfWheelsException() {}

    public OddNumberOfWheelsException(String text) {
        super(text);
    }

    public OddNumberOfWheelsException(Exception e) {
        super(e);
    }

    public OddNumberOfWheelsException(String text, Exception e) {
        super(text, e);
    }
}
