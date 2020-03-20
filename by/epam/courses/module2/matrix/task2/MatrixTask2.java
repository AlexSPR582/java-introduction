package by.epam.courses.module2.matrix.task2;

public class MatrixTask2 {
    public void printDiagonal(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][i] + " ");
        }
    }
}
