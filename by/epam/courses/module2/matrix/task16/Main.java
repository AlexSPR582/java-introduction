package by.epam.courses.module2.matrix.task16;

//16. Магическим квадратом порядка n называется квадратная матрица размера nxn,
//составленная из чисел 1, 2, 3, ... n^2
//так, что суммы по каждому столбцу, каждой строке и каждой из двух больших
//диагоналей равны между
//собой. Построить такой квадрат. Пример магического квадрата порядка 3:

import by.epam.courses.module2.array_logic.ArrayLogic;
import by.epam.courses.module2.matrix.task16.magic_square.MagicSquare;

public class Main {
    public static void main(String[] args) {
        ArrayLogic arrLog = ArrayLogic.getInstance();
        MagicSquare ms = new MagicSquare();

        int[][] magic1 = ms.createMagicSquare(3);
        int[][] magic2 = ms.createMagicSquare(4);
        int[][] magic3 = ms.createMagicSquare(6);

        arrLog.printMatrix(magic1);
        System.out.println();
        arrLog.printMatrix(magic2);
        System.out.println();
        arrLog.printMatrix(magic3);
    }
}
