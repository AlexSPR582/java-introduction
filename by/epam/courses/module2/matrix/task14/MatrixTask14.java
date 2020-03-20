package by.epam.courses.module2.matrix.task14;

public class MatrixTask14 {
    public int[][] createMatrix(int rows, int columns) {
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < columns; i++){
            for (int j = 0; j < rows; j++) {
                if (j < i + 1) {
                    matrix[j][i] = 1;
                }
            }
        }
        return matrix;
    }
}
