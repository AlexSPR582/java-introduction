package by.epam.courses.module2.decomposition.task6;

//6. Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

public class Main {
    public static void main(String[] args) {
        DecompositionTask6 task6 = new DecompositionTask6();
        System.out.println(task6.isSimpleNumbers(5, 6,7));
        System.out.println(task6.isSimpleNumbers(3,6,9));
    }
}
