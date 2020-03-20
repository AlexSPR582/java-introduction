package by.epam.courses.module2.array.task6;

//6. Задана последовательность N вещественных чисел.
//Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.

public class Main {
    public static void main(String[] args) {
        ArrayTask6 task6 = new ArrayTask6();
        double[] numbers = {5.4, 6.9, 3.1, 7.2, 5.7};
        System.out.println(task6.countSumSimpleIndexElement(numbers));
    }
}
