package by.epam.courses.module2.array_sort.task5;

//5. Сортировка вставками. Дана последовательность чисел a1, a2, ... an.
//Требуется переставить числа в порядке возрастания.
//Делается это следующим образом.
//Пусть a1, a2, ... an - упорядоченная последовательность, т.е. a1 <= a2 <= ... an.
//Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
//последовательность была тоже возрастающей.
//Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны.
//Примечание. Место помещения очередного элемента в отсортированную часть производить
//с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArraySortTask5 task5 = new ArraySortTask5();
        ArrayLogic arrLog = ArrayLogic.getInstance();
        int[] array = arrLog.createRandomArray(10);

        System.out.println("Исходный массив:");
        arrLog.printArray(array);

        System.out.println("Отсортированный массив:");
        arrLog.printArray(task5.insertSort(array));
    }
}
