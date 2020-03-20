package by.epam.courses.module2.decomposition.task3;

import static java.lang.Math.*;

public class DecompositionTask3 {
    public double findHexagonArea(double side){
        double height = findHeight(side);
        return 12 * findAreaRightTriangle(side, height);
    }

    private double findAreaRightTriangle(double side1, double side2) {
        return (side1 * side2) / 2;
    }

    private double findHeight(double side) {
        return sqrt(pow(side, 2) - pow(side / 2, 2));
    }
}
