package by.epam.courses.module2.matrix.task7;

import static java.lang.Math.*;

public class MatrixTask7 {
    public double[][] createSquareMatrix(int size) {
        double[][] matrix = new double[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                matrix[i][j] = sin((pow(i, 2) - pow(j, 2)) / (double) size);
            }
        }
        return matrix;
    }

    public int countPlusElements(double[][] matrix) {
        int plusElements = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] >= 0) {
                    plusElements++;
                }
            }
        }
        return plusElements;
    }
}
