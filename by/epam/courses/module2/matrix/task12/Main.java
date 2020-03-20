package by.epam.courses.module2.matrix.task12;

//12. Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArrayLogic arrLog = ArrayLogic.getInstance();
        MatrixTask12 task12 = new MatrixTask12();
        int[][] matrix = arrLog.createRandomMatrix(6, 5);

        System.out.println("Исходная матрица:");
        arrLog.printMatrix(matrix);

        System.out.println("Строки матрицы отсортированы по возрастанию:");
        arrLog.printMatrix(task12.sortMatrixRowsAscending(matrix));

        System.out.println("Строки матрицы отсортированы по убыванию:");
        arrLog.printMatrix(task12.sortMatrixRowsDescending(matrix));
    }
}
