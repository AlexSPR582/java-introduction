package by.epam.courses.module2.array_sort.task7;

//7. Пусть даны две неубывающие последовательности действительных чисел
//a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
//Требуется указать те места, на которые нужно вставлять элементы последовательности
//b1 <= b2 <= ... <= bm в первуюпоследовательность так,
//чтобы новая последовательность оставалась возрастающей.

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArraySortTask7 task7 = new ArraySortTask7();
        ArrayLogic arrLog = ArrayLogic.getInstance();

        int[] array1 = task7.sort(arrLog.createRandomArray(5));
        int[] array2 = task7.sort(arrLog.createRandomArray(7));

        System.out.println("Исходные массивы:");
        arrLog.printArray(array1);
        arrLog.printArray(array2);

        System.out.println("Индексы куда нужно вставить элементы второго массива");
        arrLog.printArray(task7.getInsertIndex(array1, array2));
    }
}
