package by.epam.courses.module2.matrix.task13;

public class MatrixTask13 {
    public int[][] sortMatrixColumnsAscending(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            sortColumnAscending(i, matrix);
        }
        return matrix;
    }

    public int[][] sortMatrixColumnsDescending(int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            sortColumnDescending(i, matrix);
        }
        return matrix;
    }

    private int[][] sortColumnAscending(int column, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[i][column] > matrix[j][column]) {
                    int buffer = matrix[i][column];
                    matrix[i][column] = matrix[j][column];
                    matrix[j][column] = buffer;
                }
            }
        }
        return matrix;
    }

    private int[][] sortColumnDescending(int column, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                if (matrix[i][column] < matrix[j][column]) {
                    int buffer = matrix[i][column];
                    matrix[i][column] = matrix[j][column];
                    matrix[j][column] = buffer;
                }
            }
        }
        return matrix;
    }
}
