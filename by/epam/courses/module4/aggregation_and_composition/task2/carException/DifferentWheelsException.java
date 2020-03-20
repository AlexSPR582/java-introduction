package by.epam.courses.module4.aggregation_and_composition.task2.carException;

public class DifferentWheelsException extends RuntimeException {
    public DifferentWheelsException() {}

    public DifferentWheelsException(String text) {
        super(text);
    }

    public DifferentWheelsException(Exception e) {
        super(e);
    }

    public DifferentWheelsException(String text, Exception e) {
        super(text, e);
    }
}
