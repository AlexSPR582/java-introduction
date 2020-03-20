package by.epam.courses.module2.array.task9;

//9. В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
//Если таких чисел несколько, то определить наименьшее из них.

public class Main {
    public static void main(String[] args) {
        ArrayTask9 task9 = new ArrayTask9();
        int[] array = {6, 4, 5, 6, 4};
        System.out.println(task9.findMostRepeatNumber(array));
    }
}
