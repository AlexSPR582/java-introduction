package by.epam.courses.module2.decomposition.task4.point;

import static java.lang.Math.*;

public class PointLogic {
    public void printFurthestPoints(Point... points) {
        double maxDistance = findMaxDistance(points);
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                if (findDistance(points[i], points[j]) == maxDistance) {
                    System.out.print("x1 = " + points[i].getX() + " y1 = " + points[i].getY() + "; ");
                    System.out.println("x2 = " + points[j].getX() + " y2 = " + points[j].getY() + "; ");
                }
            }
        }
    }

    private double findDistance(Point point1, Point point2) {
        return sqrt(pow(point1.getX() - point2.getX(), 2) + pow(point1.getY() - point2.getY(), 2));
    }

    private double findMaxDistance(Point... points) {
        double maxDistance = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                double distance = findDistance(points[i], points[j]);
                if (distance > maxDistance) {
                    maxDistance = distance;
                }
            }
        }
        return maxDistance;
    }
}
