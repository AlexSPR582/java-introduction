package by.epam.courses.module2.decomposition.task4;

//4. На плоскости заданы своими координатами n точек.
//Написать метод(методы), определяющие, между какими
//из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.

import by.epam.courses.module2.decomposition.task4.point.Point;
import by.epam.courses.module2.decomposition.task4.point.PointLogic;

public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1,1);
        Point point2 = new Point(3,1);
        Point point3 = new Point(1,3);
        Point point4 = new Point(3,3);
        PointLogic pl = new PointLogic();
        pl.printFurthestPoints(point1, point2, point3, point4);
    }
}
