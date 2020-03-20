package by.epam.courses.module2.matrix.task2;

//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArrayLogic arrLog = ArrayLogic.getInstance();
        MatrixTask2 task2 = new MatrixTask2();
        int[][] matrix = arrLog.createRandomMatrix(5, 5);

        System.out.println("Исходная матрица:");
        arrLog.printMatrix(matrix);

        System.out.println("Результат выполнения программы:");
        task2.printDiagonal(matrix);
    }
}
