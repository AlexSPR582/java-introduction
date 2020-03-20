package by.epam.courses.module2.matrix.task11;

import by.epam.courses.module2.array_logic.ArrayLogic;

import java.util.Random;

public class MatrixTask11 {
    public int[][] createMatrix() {
        int[][] matrix = new int[10][20];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                matrix[i][j] = random.nextInt(16);
            }
        }
        return matrix;
    }

    public int[] findRows(int[][] matrix) {
        ArrayLogic arrLog = ArrayLogic.getInstance();
        int[] rows = new int[0];
        int fiveRepeat = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 5) {
                    fiveRepeat++;
                }
            }
            if (fiveRepeat >= 3) {
                rows = arrLog.addNewElement(i + 1, rows);
            }
            fiveRepeat = 0;
        }
        return rows;
    }
}
