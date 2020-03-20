package by.epam.courses.module2.matrix.task14;

//14. Сформировать случайную матрицу m x n, состоящую из нулей и единиц,
//причем в каждом столбце число единиц равно номеру столбца.

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArrayLogic arrLog = ArrayLogic.getInstance();
        MatrixTask14 task14 = new MatrixTask14();
        arrLog.printMatrix(task14.createMatrix(6, 5));
    }
}
