package by.epam.courses.module2.array.task10;

//10. Дан целочисленный массив с количеством элементов п.
//Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями).
//Примечание. Дополнительный массив не использовать.

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        ArrayTask10 task10 = new ArrayTask10();
        ArrayLogic arrLog = ArrayLogic.getInstance();
        int[] array = arrLog.createRandomArray(7);

        System.out.println("Исходный массив:");
        arrLog.printArray(array);

        System.out.println("Результат выполнения программы");
        task10.printArray(task10.compressArray(array));
    }
}
