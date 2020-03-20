package by.epam.courses.module2.decomposition.task13;

//13. Два простых числа называются «близнецами»,
//если они отличаются друг от друга на 2 (например, 41 и 43).
//Найти и напечатать все пары «близнецов» из отрезка [n,2n],
//где n - заданное натуральное число больше 2. Для
//решения задачи использовать декомпозицию.

public class Main {
    public static void main(String[] args) {
        DecompositionTask13 task13 = new DecompositionTask13();
        task13.findTwinsSimpleNumbers(40);
    }
}
