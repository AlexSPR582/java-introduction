package by.epam.courses.module2.decomposition.task14;

//14. Натуральное число, в записи которого n цифр, называется числом Армстронга,
//если сумма его цифр, возведенная в степень n, равна самому числу.
//Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.

import by.epam.courses.module2.array_logic.ArrayLogic;

public class Main {
    public static void main(String[] args) {
        DecompositionTask14 task14 = new DecompositionTask14();
        ArrayLogic arrLog = ArrayLogic.getInstance();
        arrLog.printArray(task14.findArmstrongNumbers(10000));
    }
}
