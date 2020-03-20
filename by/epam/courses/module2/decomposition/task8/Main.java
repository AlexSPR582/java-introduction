package by.epam.courses.module2.decomposition.task8;

//8. Задан массив D. Определить следующие суммы:
//D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
//Пояснение. Составить метод(методы) для вычисления суммы трех последовательно
//расположенных элементов массива с номерами от k до m.

public class Main {
    public static void main(String[] args) {
        DecompositionTask8 task8 = new DecompositionTask8();
        int[] array = {5, 6, 3, 4, 43};
        System.out.println("Сумма последовательно стоящих трёх элементов: ");
        System.out.println(task8.sumThreeElement(1, array));
    }
}
