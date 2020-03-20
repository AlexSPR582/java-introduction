package by.epam.courses.module2.matrix.task9;

public class MatrixTask9 {
    public int findColumnMaxSum(int[][] matrix) {
        int column = 0;
        int maxSum = 0;
        for (int i = 0; i < matrix[0].length; i++) {
            int sumColumn = findSumColumn(i, matrix);
            if (sumColumn > maxSum){
                maxSum = sumColumn;
                column = i + 1;
            }
        }
        return column;
    }

    private int findSumColumn(int column, int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][column];
        }
        return sum;
    }
}
