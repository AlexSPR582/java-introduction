package by.epam.courses.module2.matrix.task7;

//7. Сформировать квадратную матрицу порядка N по правилу.
//и подсчитать количество положительных элементов в ней.

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArrayLogic arrLog = ArrayLogic.getInstance();
        MatrixTask7 task7 = new MatrixTask7();

        double[][] matrix = task7.createSquareMatrix(5);
        arrLog.printMatrix(matrix);

        System.out.println("Количество положительных элементов:" );
        System.out.println(task7.countPlusElements(matrix));
    }
}
