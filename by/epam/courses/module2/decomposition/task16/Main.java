package by.epam.courses.module2.decomposition.task16;

//16. Написать программу, определяющую сумму n - значных чисел,
//содержащих только нечетные цифры.
//Определить также, сколько четных цифр в найденной сумме.
//Для решения задачи использовать декомпозицию.

public class Main {
    public static void main(String[] args) {
        DecompositionTask16 task16 = new DecompositionTask16();
        int result = task16.sumOnlyOddNumbers(1);
        System.out.println(result);
        System.out.println(task16.sumEvenNumerals(result));
    }
}
