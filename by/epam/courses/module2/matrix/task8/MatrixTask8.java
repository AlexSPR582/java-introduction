package by.epam.courses.module2.matrix.task8;

public class MatrixTask8 {
    public int[][] swapColumns(int first, int second, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++){
            int buffer = matrix[i][first - 1];
            matrix[i][first - 1] = matrix[i][second - 1];
            matrix[i][second - 1] = buffer;
        }
        return matrix;
    }
}
