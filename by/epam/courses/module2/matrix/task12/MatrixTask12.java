package by.epam.courses.module2.matrix.task12;

public class MatrixTask12 {
    public int[][] sortMatrixRowsAscending(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            sortRowAscending(matrix[i]);
        }
        return matrix;
    }

    public int[][] sortMatrixRowsDescending(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            sortRowDescending(matrix[i]);
        }
        return matrix;
    }

    private int[] sortRowAscending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++){
                if (array[i] > array[j]) {
                    int buffer = array[i];
                    array[i] = array[j];
                    array[j] = buffer;
                }
            }
        }
        return array;
    }

    private int[] sortRowDescending(int[] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++){
                if (array[i] < array[j]) {
                    int buffer = array[i];
                    array[i] = array[j];
                    array[j] = buffer;
                }
            }
        }
        return array;
    }
}
