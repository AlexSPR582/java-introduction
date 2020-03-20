package by.epam.courses.module2.matrix.task6;

public class MatrixTask6 {
    public int[][] createSquareMatrix(int size) {
        int[][] matrix = new int[size][size];
        createFirstPart(matrix);
        createSecondPart(matrix);
        createThirdPart(matrix);
        createFourthPart(matrix);
        return matrix;
    }

    private int[][] createFirstPart(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                if (i <= j) {
                    matrix[i][j] = 1;
                }
            }
        }
        return matrix;
    }

    private int[][] createSecondPart(int[][] matrix) {
        for (int i = 0; i < matrix.length / 2; i++) {
            for (int j = matrix.length / 2; j < matrix.length; j++) {
                if (j < matrix.length - i){
                    matrix[i][j] = 1;
                }
            }
        }
        return matrix;
    }

    private int[][] createThirdPart(int[][] matrix) {
        for (int i = matrix.length / 2; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length / 2; j++) {
                if (j >= matrix.length - i - 1) {
                    matrix[i][j] = 1;
                }
            }
        }
        return matrix;
    }

    private int[][] createFourthPart(int[][] matrix) {
        for (int i = matrix.length / 2; i < matrix.length; i++) {
            for (int j = matrix.length / 2; j < matrix.length; j++) {
                if (j <= i) {
                    matrix[i][j] = 1;
                }
            }
        }
        return matrix;
    }
}
