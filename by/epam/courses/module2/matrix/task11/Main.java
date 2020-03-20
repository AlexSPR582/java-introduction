package by.epam.courses.module2.matrix.task11;

//11. Матрицу 10x20 заполнить случайными числами от 0 до 15.
//Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArrayLogic arrLog = ArrayLogic.getInstance();
        MatrixTask11 task11 = new MatrixTask11();
        int[][] matrix = task11.createMatrix();

        System.out.println("Исходная матрица");
        arrLog.printMatrix(matrix);

        System.out.println("Номера строк где число 5 встречается 3 и более раз:");
        arrLog.printArray(task11.findRows(matrix));
    }
}
