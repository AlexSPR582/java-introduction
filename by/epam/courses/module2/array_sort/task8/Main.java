package by.epam.courses.module2.array_sort.task8;

//8.Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральные).
//Составить программу, которая приводит эти дроби к общему
//знаменателю и упорядочивает их в порядке возрастания.

import by.epam.courses.module2.array_sort.task8.fraction.Fraction;
import by.epam.courses.module2.array_sort.task8.fraction.FractionLogic;

public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(3, 5);
        Fraction fraction2 = new Fraction(1, 2);
        Fraction fraction3 = new Fraction(2, 3);
        FractionLogic fl = new FractionLogic();
        System.out.println("Общий знаменатель: " + fl.findCommonDenominator(fraction1, fraction2, fraction3));
        System.out.println("Сортировка дробей:");
        fl.print(fl.sort(fraction1, fraction2, fraction3));
    }
}
