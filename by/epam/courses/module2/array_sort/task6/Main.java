package by.epam.courses.module2.array_sort.task6;

import by.epam.courses.module2.array_logic.ArrayLogic;

//6. Сортировка Шелла. Дан массив n действительных чисел.
//Требуется упорядочить его по возрастанию.
//Делается это следующим образом: сравниваются два соседних элемента ai и ai+1.
//Если ai <= ai+1, то продвигаются на один элемент вперед.
//Если a1 > ai+1, то производится перестановка и сдвигаются на один элемент назад.
//Составить алгоритм этой сортировки.

public class Main {
    public static void main(String[] args) {
        ArraySortTask6 task6 = new ArraySortTask6();
        ArrayLogic arrLog = ArrayLogic.getInstance();
        double[] array = {5.4, 3.2, 7.2, 8.1, 1.5};

        System.out.println("Исходный массив:");
        arrLog.printArray(array);

        System.out.println("Отсортированный массив:");
        arrLog.printArray(task6.shellSort(array));
    }
}
