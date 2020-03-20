package by.epam.courses.module2.matrix.task3;

public class MatrixTask3 {
    public void printColumn(int column, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][column - 1] + " ");
        }
        System.out.println();
    }

    public void printRow(int row, int[][] matrix) {
        for (int i = 0; i < matrix[row - 1].length; i++) {
            System.out.print(matrix[row - 1][i] + " ");
        }
        System.out.println();
    }
}
