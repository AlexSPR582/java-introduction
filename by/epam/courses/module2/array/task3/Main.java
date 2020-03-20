package by.epam.courses.module2.array.task3;

//3. Дан массив действительных чисел, размерность которого N.
//Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArrayTask3 task3 = new ArrayTask3();
        ArrayLogic arrLog = ArrayLogic.getInstance();
        int[] array = arrLog.createRandomArray(7);

        System.out.println("Исходный массив:");
        arrLog.printArray(array);

        System.out.println("количество положительных элементов: " + task3.countPlusElements(array));
        System.out.println("количество отрицательных элементов: " + task3.countNegativeElements(array));
        System.out.println("количество нулевых элементов: " + task3.countZeroElements(array));
    }
}
