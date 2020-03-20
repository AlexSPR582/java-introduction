package by.epam.courses.module2.array.task5;

//5. Даны целые числа а1 ,а2 ,..., аn .
//Вывести на печать только те числа, для которых аi > i.

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArrayTask5 task5 = new ArrayTask5();
        ArrayLogic arrLog = ArrayLogic.getInstance();
        int[] array = arrLog.createPlusRandomArray(7);

        System.out.println("Исходный массив:");
        arrLog.printArray(array);
        System.out.println("Результат:");
        task5.printElementsBiggerThanIndex(array);
    }
}
