package by.epam.courses.module2.matrix.task3;

//3. Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArrayLogic arrLog = ArrayLogic.getInstance();
        MatrixTask3 task3 = new MatrixTask3();

        int[][] matrix = arrLog.createRandomMatrix(4, 5);

        System.out.println("Исходная матрица:");
        arrLog.printMatrix(matrix);

        System.out.println("Указанный столбец:");
        task3.printColumn(1, matrix);
        task3.printColumn(3, matrix);

        System.out.println("Указанная строка:");
        task3.printRow(1, matrix);
        task3.printRow(4, matrix);
    }
}
