package by.epam.courses.module2.matrix.task16.magic_square;

public class DoublyEvenMagicSquare {
    public int[][] createMagicSquare(int n) {
        int[][] magic = startInitialization(n);
        swapVertical(magic);
        swapHorizontal(magic);
        return  magic;
    }

    public int[][] startInitialization(int n) {
        int[][] startArray = new int[n][n];
        int value = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                startArray[i][j] = value;
                value++;
            }
        }
        return startArray;
    }

    private int[][] swapVertical(int[][] magic) {
        int size = magic.length;
        for (int i = 0; i < size / 4; i++) {
            for (int j = size / 4; j < size - (size / 4); j++) {
                int buffer = magic[i][j];
                magic[i][j] = magic[size - 1 - i][size - 1 - j];
                magic[size - 1 - i][size - 1 - j] = buffer;
            }
        }
        return magic;
    }

    private int[][] swapHorizontal(int[][] magic) {
        int size = magic.length;
        for (int i = size / 4; i < size - (size / 4); i++) {
            for (int j = 0; j < size / 4; j++) {
                int buffer = magic[i][j];
                magic[i][j] = magic[size - 1 - i][size - 1 - j];
                magic[size - 1 - i][size - 1 - j] = buffer;
            }
        }
        return magic;
    }

    public void printArray(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
