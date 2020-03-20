package by.epam.courses.module2.matrix.task16.magic_square;

public class OddNumberedMagicSquare {
    public int[][] createMagicSquare(int n) {
        int[][] magic = new int[n][n];
        int row = 0;
        int column = n / 2;
        int value = 1;
        for (int i = 0; i < n * n; i++) {
            if (magic[row][column] == 0) {
                magic[row][column] = value;
            }
            else {
                if (row + 2 >= n) {
                    row = row + 2 - n;
                }
                else {
                    row = row + 2;
                }
                if (column - 1 < 0) {
                    column = n - 1;
                }
                else {
                    column = column - 1;
                }
                magic[row][column] = value;
            }
            if (row - 1 < 0) {
                row = n - 1;
            }
            else {
                row = row - 1;
            }

            if (column + 1 >= n) {
                column = 0;
            }
            else {
                column = column + 1;
            }
            value++;
        }
        return magic;
    }
}
