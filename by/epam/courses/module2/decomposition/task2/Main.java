package by.epam.courses.module2.decomposition.task2;

//2. Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class Main {
    public static void main(String[] args) {
        DecompositionTask2 task2 = new DecompositionTask2();
        System.out.println("Наибольший общий делитель 4-х чисел: " +
                task2.findCommonFactor(6,3,9,12));
    }
}
