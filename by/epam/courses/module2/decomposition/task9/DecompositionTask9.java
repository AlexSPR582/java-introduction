package by.epam.courses.module2.decomposition.task9;

import static java.lang.Math.*;

public class DecompositionTask9 {
    public double findQuadrangleArea(double x, double y, double z, double t){
        return findAreaRightTriangle(x, y) + findTriangleArea(z, t, findHypotenuse(x, y));
    }

    private double findHypotenuse(double side1, double side2){
        return sqrt(pow(side1, 2) + pow(side2, 2));
    }

    private double findAreaRightTriangle(double side1, double side2){
        return (side1 * side2) / 2;
    }

    private double findTriangleArea(double side1, double side2, double side3){
        double p = (side1 + side2 + side3) / 2;
        return sqrt(p * (p - side1) * (p - side2) * (p - side3));
    }
}
