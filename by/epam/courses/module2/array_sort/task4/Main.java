package by.epam.courses.module2.array_sort.task4;

//4. Сортировка обменами. Дана последовательность чисел a1 <= a2 <= ... an.
//Требуется переставить числа в порядке возрастания. Для этого сравниваются два соседних числа
//ai ai+1. Если ai > ai+1, то делается перестановка.
//Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArraySortTask4 task4 = new ArraySortTask4();
        ArrayLogic arrLog = ArrayLogic.getInstance();
        int[] array = arrLog.createRandomArray(10);

        System.out.println("Исходный массив:");
        arrLog.printArray(array);

        System.out.println("Отсортированный массив:");
        arrLog.printArray(task4.bubbleSort(array));

        System.out.println("Количество перестарновок: " + task4.getPermutation());
    }
}
