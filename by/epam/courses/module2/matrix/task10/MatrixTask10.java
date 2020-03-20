package by.epam.courses.module2.matrix.task10;

import by.epam.courses.module2.array_logic.ArrayLogic;

public class MatrixTask10 {
    public int[] findPlusElementsMainDiagonal(int[][] matrix) {
        ArrayLogic arrLog = ArrayLogic.getInstance();
        int[] plusElements = new int[0];
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i][i] >= 0){
                plusElements = arrLog.addNewElement(matrix[i][i], plusElements);
            }
        }
        return plusElements;
    }
}
