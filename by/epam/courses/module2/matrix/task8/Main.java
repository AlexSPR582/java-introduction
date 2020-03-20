package by.epam.courses.module2.matrix.task8;

//8. В числовой матрице поменять местами два столбца любых столбца,
//т.е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы второго переместить в первый.
//Номера столбцов вводит пользователь с клавиатуры.

import by.epam.courses.module2.array_logic.ArrayLogic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayLogic arrLog = ArrayLogic.getInstance();
        MatrixTask8 task8 = new MatrixTask8();

        int[][] matrix = arrLog.createRandomMatrix(5, 6);
        System.out.println("Исходная матрица:");
        arrLog.printMatrix(matrix);

        System.out.println("нумерация столбцов начинается с 1");
        System.out.print("Введите номер первого столбца : ");
        int firstColumn = sc.nextInt();
        System.out.print("Введите номер второго столбца: ");
        int secondColumn = sc.nextInt();

        task8.swapColumns(firstColumn, secondColumn, matrix);
        System.out.println("Результат выполнения программы:");
        arrLog.printMatrix(matrix);
    }
}
