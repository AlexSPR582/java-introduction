package by.epam.courses.module2.matrix.task5;

//5. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArrayLogic arrLog = ArrayLogic.getInstance();
        MatrixTask5 task5 = new MatrixTask5();
        arrLog.printMatrix(task5.createSquareMatrix(6));
    }
}
