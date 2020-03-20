package by.epam.courses.module2.matrix.task10;

//10. Найти положительные элементы главной диагонали квадратной матрицы.

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArrayLogic arrLog = ArrayLogic.getInstance();
        MatrixTask10 task10 = new MatrixTask10();
        int[][] matrix = arrLog.createRandomMatrix(6, 6);

        System.out.println("Исходная матрица:");
        arrLog.printMatrix(matrix);

        System.out.println("Положительные элементы на главной диагонали:");
        arrLog.printArray(task10.findPlusElementsMainDiagonal(matrix));
    }
}
