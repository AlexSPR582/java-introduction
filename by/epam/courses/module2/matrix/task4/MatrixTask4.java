package by.epam.courses.module2.matrix.task4;

public class MatrixTask4 {
    public int[][] createSquareMatrix(int size){
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++){
            if (i % 2 == 0){
                for (int j = 0; j < size; j++){
                    matrix[i][j] = j + 1;
                }
            }
            else {
                for (int j = 0; j < size; j++){
                    matrix[i][j] = size - j;
                }
            }
        }
        return matrix;
    }
}
