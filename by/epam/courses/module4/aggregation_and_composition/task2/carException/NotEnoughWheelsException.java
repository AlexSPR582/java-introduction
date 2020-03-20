package by.epam.courses.module4.aggregation_and_composition.task2.carException;

public class NotEnoughWheelsException extends RuntimeException {
    public NotEnoughWheelsException() {}

    public NotEnoughWheelsException(String text) {
        super(text);
    }

    public NotEnoughWheelsException(Exception e) {
        super(e);
    }

    public NotEnoughWheelsException(String text, Exception e) {
        super(text, e);
    }
}
