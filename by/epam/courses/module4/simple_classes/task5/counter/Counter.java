package by.epam.courses.module4.simple_classes.task5.counter;

import java.util.Objects;

public class Counter {
    private int value = 0;
    private int rightRange = 10;
    private int leftRange = -10;

    public Counter(){}

    public Counter(int value, int leftRange, int rightRange){
        this.value = value;
        this.leftRange = leftRange;
        this.rightRange = rightRange;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public int getRightRange() {
        return rightRange;
    }

    public void setRightRange(int rightRange) {
        this.rightRange = rightRange;
    }

    public int getLeftRange() {
        return leftRange;
    }

    public void setLeftRange(int leftRange) {
        this.leftRange = leftRange;
    }

    public int getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Counter counter = (Counter) o;
        return value == counter.value &&
                rightRange == counter.rightRange &&
                leftRange == counter.leftRange;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, rightRange, leftRange);
    }

    @Override
    public String toString() {
        return "Counter{" +
                "value=" + value +
                ", rightRange=" + rightRange +
                ", leftRange=" + leftRange +
                '}';
    }
}
