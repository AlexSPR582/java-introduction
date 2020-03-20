package by.epam.courses.module2.decomposition.task4.point;

public class Point {
    private double[] coordinates;

    public Point(double x, double y) {
        coordinates = new double[2];
        coordinates[0] = x;
        coordinates[1] = y;
    }

    public double[] getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(double[] coordinates) {
        this.coordinates = coordinates;
    }

    public double getX() {
        return coordinates[0];
    }

    public double getY() {
        return coordinates[1];
    }
}
