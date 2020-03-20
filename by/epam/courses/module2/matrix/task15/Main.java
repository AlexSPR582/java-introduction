package by.epam.courses.module2.matrix.task15;

//15. Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArrayLogic arrLog = ArrayLogic.getInstance();
        MatrixTask15 task15 = new MatrixTask15();
        int[][] matrix = arrLog.createRandomMatrix(5, 6);

        System.out.println("Исходная матрица:");
        arrLog.printMatrix(matrix);

        System.out.println("Наибольший элемент: " + task15.findMax(matrix));

        System.out.println("Все нечётные элементы заменены на наибольший элемент:");
        arrLog.printMatrix(task15.replaceOddElementWithMax(matrix));
    }
}
