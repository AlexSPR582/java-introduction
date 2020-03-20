package by.epam.courses.module2.decomposition.task11;

//11. Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

public class Main {
    public static void main(String[] args) {
        DecompositionTask11 task11 = new DecompositionTask11();

        System.out.println("1 - в первом числе цифр больше чем во втором");
        System.out.println("-1 - во втором числе цифр больше чем в первом");
        System.out.println("0 - количество цифр в первом и втором числе одинаковое");

        System.out.println(task11.longerNumber(10, 456));
        System.out.println(task11.longerNumber(345, 29));
        System.out.println(task11.longerNumber(40, 40));
    }
}
