package by.epam.courses.module2.matrix.task16.magic_square;

public class MagicSquare {
    public int[][] createMagicSquare(int n) {
        if (n % 2 != 0) {
            OddNumberedMagicSquare ms = new OddNumberedMagicSquare();
            return ms.createMagicSquare(n);
        }
        else if (n % 4 != 0) {
            SinglyEvenMagicSquare ms = new SinglyEvenMagicSquare();
            return ms.createMagicSquare(n);
        }
        else {
            DoublyEvenMagicSquare ms = new DoublyEvenMagicSquare();
            return ms.createMagicSquare(n);
        }
    }
}
