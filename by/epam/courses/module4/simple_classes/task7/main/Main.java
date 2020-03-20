package by.epam.courses.module4.simple_classes.task7.main;

//7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
//площади, периметра и точки пересечения медиан.

import by.epam.courses.module4.simple_classes.task7.point.Point;
import by.epam.courses.module4.simple_classes.task7.point.PointLogic;
import by.epam.courses.module4.simple_classes.task7.triangle.Triangle;
import by.epam.courses.module4.simple_classes.task7.triangle.TriangleLogic;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(2, 1);
        Point point2 = new Point(6, 1);
        Point point3 = new Point(4, 4);

        Triangle triangle = new Triangle(point1, point2, point3);
        TriangleLogic tl = TriangleLogic.getInstance();
        PointLogic pl = PointLogic.getInstance();

        System.out.println("периметр триугольника равен: " + tl.calculatePerimeter(triangle));
        System.out.println("площадь треугольника равна: " + tl.calculateAreaOfTriangle(triangle));
        System.out.print("точка пересечения медиан: ");
        pl.printPoint(tl.intersectionOfMedians(triangle));
    }
}
