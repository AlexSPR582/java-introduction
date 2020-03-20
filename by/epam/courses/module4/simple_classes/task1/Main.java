package by.epam.courses.module4.simple_classes.task1;

//1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
//переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
//наибольшее значение из этих двух переменных.

public class Main {
    public static void main(String[] args) {
        Test1 test1 = new Test1();
        test1.setA(10);
        test1.setB(2);
        test1.printA();
        test1.printB();
        System.out.println(test1.sum());
        System.out.println(test1.findBigger());
    }
}
