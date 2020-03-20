package by.epam.courses.module2.matrix.task16.magic_square;

import static java.lang.Math.*;

public class SinglyEvenMagicSquare {
    public int[][] createMagicSquare(int n) {
        int[][] magic = createStartMagicSquare(n);
        swapHighlightAD(magic);
        swapHighlightBC(magic);
        return magic;
    }

    private int[][] createStartMagicSquare(int n) {
        OddNumberedMagicSquare oddNumberedMagicSquare = new OddNumberedMagicSquare();
        int[][] startMagic = oddNumberedMagicSquare.createMagicSquare(n / 2);
        int[][] magic = new int[n][n];
        for (int i = 0; i < n / 2; i++) {
            for (int j = 0; j < n / 2; j++) {
                magic[i][j] = startMagic[i][j];
                magic[i][j + n / 2] = startMagic[i][j] + 2 *(int) pow(n / 2, 2);
                magic[i + n / 2][j] = startMagic[i][j] + 3 * (int) pow(n / 2, 2);
                magic[i + n / 2][j + n / 2] = startMagic[i][j] + (int) pow(n / 2, 2);
            }
        }
        return magic;
    }

    private int[][] swapHighlightAD(int[][] magic) {
        int size = magic.length;
        for (int i = 0; i < size / 2; i++) {
            for (int j = 0; j < size / 4; j++) {
                if (i != size / 4) {
                    int buffer = magic[i][j];
                    magic[i][j] = magic[i + size / 2][j];
                    magic[i + size / 2][j] = buffer;
                }
                else {
                    int buffer = magic[i][j + 1];
                    magic[i][j + 1] = magic[i + size / 2][j + 1];
                    magic[i + size / 2][j + 1] = buffer;
                }
            }
        }
        return magic;
    }

    private int[][] swapHighlightBC(int[][] magic) {
        int size = magic.length;
        for (int i = 0; i < size / 2; i++) {
            for (int j = size - (size / 4 - 1); j < size; j++) {
                int buffer = magic[i][j];
                magic[i][j] = magic[i + size / 2][j];
                magic[i + size / 2][j] = buffer;
            }
        }
        return magic;
    }
}
