package by.epam.courses.module2.array_logic;

import java.text.DecimalFormat;
import java.util.Random;

public class ArrayLogic {
    private static ArrayLogic arrayLogic;

    private ArrayLogic() {}

    public static ArrayLogic getInstance() {
        if (arrayLogic == null) {
            arrayLogic = new ArrayLogic();
        }
        return arrayLogic;
    }

    public int[] createRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(20);
            if (random.nextInt(10) >= 7) {
                array[i] = array[i] * (-1);
            }
        }
        return array;
    }

    public int[] createPlusRandomArray(int size) {
        Random random = new Random();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(20);
        }
        return array;
    }

    public int[][] createRandomMatrix(int rows, int columns) {
        Random random = new Random();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(20);
                if (random.nextInt(10) >= 7) {
                    matrix[i][j] = matrix[i][j] * (-1);
                }
            }
        }
        return matrix;
    }

    public int[][] createPlusRandomMatrix(int rows, int columns) {
        Random random = new Random();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = random.nextInt(20);
            }
        }
        return matrix;
    }

    public void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printMatrix(double[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                String number = new DecimalFormat("#0.00").format(matrix[i][j]);
                System.out.print(number + " ");
            }
            System.out.println();
        }
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public void printArray(double[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public int[] addNewElement(int element, int[] array) {
        int[] newArray = new int[array.length + 1];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[array.length] = element;
        return newArray;
    }
}
