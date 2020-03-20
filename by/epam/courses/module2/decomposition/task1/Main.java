package by.epam.courses.module2.decomposition.task1;

//1. Написать метод(методы) для нахождения наибольшего общего делителя
//и наименьшего общего кратного двух натуральных чисел:

public class Main {
    public static void main(String[] args) {
        DecompositionTask1 task1 = new DecompositionTask1();
        System.out.println("НОК: " + task1.findNok(5, 6));
    }
}
