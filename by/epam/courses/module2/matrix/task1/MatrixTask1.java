package by.epam.courses.module2.matrix.task1;

public class MatrixTask1 {
    public void printOddColumnsWhereFirstElementLargerThanLast(int[][] matrix){
        for (int i = 0; i < matrix[0].length; i++){
            int firstElement = matrix[0][i];
            int lastElement = matrix[matrix.length - 1][i];
            if (firstElement > lastElement) {
                printColumn(i, matrix);
            }
            i++;
        }
    }

    private void printColumn(int columnNumber, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.print(matrix[i][columnNumber] + " ");
        }
        System.out.println();
    }
}
