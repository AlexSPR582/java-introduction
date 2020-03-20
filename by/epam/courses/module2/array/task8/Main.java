package by.epam.courses.module2.array.task8;

//8. Дана последовательность целых чисел a1, a2, ..., an.
//Образовать новую последовательность, выбросив из
//исходной те члены, которые равны
//min(a1, a2, ..., an).

public class Main {
    public static void main(String[] args) {
        ArrayTask8 task8 = new ArrayTask8();
        int[] array = {4, 7, 5, 4, 9};
        task8.printArray(task8.createArrayWithoutMinElement(array));
    }
}
