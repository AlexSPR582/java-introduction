package by.epam.courses.module2.matrix.task13;

//13. Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArrayLogic arrLog = ArrayLogic.getInstance();
        MatrixTask13 task13 = new MatrixTask13();
        int[][] matrix = arrLog.createRandomMatrix(6, 5);

        System.out.println("Исходная матрица:");
        arrLog.printMatrix(matrix);

        System.out.println("Столбцы матрицы отсортированы по возрастанию:");
        arrLog.printMatrix(task13.sortMatrixColumnsAscending(matrix));

        System.out.println("Столбцы матрицы отсортированы по убыванию:");
        arrLog.printMatrix(task13.sortMatrixColumnsDescending(matrix));
    }
}
