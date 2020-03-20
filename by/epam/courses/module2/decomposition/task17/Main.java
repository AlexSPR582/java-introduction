package by.epam.courses.module2.decomposition.task17;

//17. Из заданного числа вычли сумму его цифр.
//Из результата вновь вычли сумму его цифр и т.д. Сколько таких
//действий надо произвести, чтобы получился нуль?
//Для решения задачи использовать декомпозицию.

public class Main {
    public static void main(String[] args) {
        DecompositionTask17 task17 = new DecompositionTask17();
        System.out.println(task17.countOperations(65));
    }
}
