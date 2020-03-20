package by.epam.courses.module2.array_sort.task3;

//3. Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... an.
//Требуется переставить элементы так,
//чтобы они были расположены по убыванию.
//Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего.
//Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором.

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArraySortTask3 task3 = new ArraySortTask3();
        ArrayLogic arrLog = ArrayLogic.getInstance();
        int[] array = arrLog.createRandomArray(7);

        System.out.println("Исходный массив:");
        arrLog.printArray(array);

        System.out.println("Отсортированный массив:");
        arrLog.printArray(task3.selectionSort(array));
    }
}
