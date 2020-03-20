package by.epam.courses.module2.matrix.task1;

//1. Дана матрица. Вывести на экран все нечетные столбцы,
// у которых первый элемент больше последнего.

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        MatrixTask1 task1 = new MatrixTask1();
        ArrayLogic arrLog = ArrayLogic.getInstance();
        int[][] matrix = arrLog.createRandomMatrix(4, 5);

        System.out.println("Исходная матрица:");
        arrLog.printMatrix(matrix);

        System.out.println("Результат выполнения программы:");
        task1.printOddColumnsWhereFirstElementLargerThanLast(matrix);
    }
}
