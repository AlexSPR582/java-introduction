package by.epam.courses.module2.array.task2;

//2. Дана последовательность действительных чисел а1 ,а2 ,..., ап.
//Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArrayTask2 task2 = new ArrayTask2();
        ArrayLogic arrLog = ArrayLogic.getInstance();
        int[] array = arrLog.createRandomArray(7);

        System.out.println("Исходный массив:");
        arrLog.printArray(array);

        System.out.println("количество замен: " + task2.countReplacement(4, array));

        System.out.println("Массив после проведения замены:");
        arrLog.printArray(task2.replace(4, array));
    }
}
