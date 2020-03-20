package by.epam.courses.module4.simple_classes.task5.main;

//5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
//на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
//произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
//позволяющее получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

import by.epam.courses.module4.simple_classes.task5.counter.CounterLogic;
import by.epam.courses.module4.simple_classes.task5.counter.Counter;

public class Main {
    public static void main(String[] args) {
        CounterLogic cl = CounterLogic.getInstance();
        Counter counter1 = new Counter();
        Counter counter2 = new Counter(4, -20, 20);
        System.out.println("Значение первого счётчика: " + counter1.getValue());
        System.out.println("Значение второго счётчика: " + counter2.getValue());

        System.out.println('\n' + "Увеличение значения первого счётчика на 1");
        cl.increaseCounter(counter1);
        System.out.println("Значение первого счётчика: " + counter1.getValue());

        System.out.println('\n' + "Уменьшение значения второго счётчика на 1");
        cl.reduceCounter(counter2);
        System.out.println("Значение второго счётчика: " + counter2.getValue());
    }
}
