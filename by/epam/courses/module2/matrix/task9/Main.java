package by.epam.courses.module2.matrix.task9;

//9. Задана матрица неотрицательных чисел.
//Посчитать сумму элементов в каждом столбце.
//Определить, какой столбец содержит максимальную сумму.

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArrayLogic arrLog = ArrayLogic.getInstance();
        MatrixTask9 task9 = new MatrixTask9();
        int[][] matrix = arrLog.createPlusRandomMatrix(5, 6);

        System.out.println("Исходная матрица:");
        arrLog.printMatrix(matrix);

        System.out.print("Максимальную сумму соржержит слоблец под номером: ");
        System.out.println(task9.findColumnMaxSum(matrix));
    }
}
