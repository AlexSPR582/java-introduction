package by.epam.courses.module2.matrix.task15;

public class MatrixTask15 {
    public int[][] replaceOddElementWithMax(int[][] matrix) {
        int maxElement = findMax(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] % 2 != 0) {
                    matrix[i][j] = maxElement;
                }
            }
        }
        return matrix;
    }

    public int findMax(int[][] matrix){
        int max = matrix[0][0];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[0].length; j++){
                if (matrix[i][j] > max){
                    max = matrix[i][j];
                }
            }
        }
        return max;
    }
}
