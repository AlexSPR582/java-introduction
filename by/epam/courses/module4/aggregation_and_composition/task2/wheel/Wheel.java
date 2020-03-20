package by.epam.courses.module4.aggregation_and_composition.task2.wheel;

import java.util.Objects;

public class Wheel {
    private int diameter;
    private int width;

    public Wheel(int diameter, int width) {
        this.diameter = diameter;
        this.width = width;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getDiameter() {
        return diameter;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Wheel wheel = (Wheel) o;
        return diameter == wheel.diameter &&
                width == wheel.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(diameter, width);
    }

    @Override
    public String toString() {
        return "Wheel{" +
                "diameter=" + diameter +
                ", width=" + width +
                '}';
    }
}
