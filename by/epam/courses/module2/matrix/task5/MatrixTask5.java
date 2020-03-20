package by.epam.courses.module2.matrix.task5;

public class MatrixTask5 {
    public int[][] createSquareMatrix(int size) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++){
            for (int j = 0; j < size; j++){
                if (j < size - i){
                    matrix[i][j] = i + 1;
                }
                else {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
}
