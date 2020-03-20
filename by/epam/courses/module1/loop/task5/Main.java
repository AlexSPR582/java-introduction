package by.epam.courses.module1.loop.task5;

//5. Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
//   заданному е. Общий член ряда имеет вид:
//   an = 1 / 2 ^ n + 1 / 3 ^ n

public class Main {
    public static void main(String[] args) {
        LoopTask5 task5 = new LoopTask5();
        System.out.println(task5.sum(0.3));
    }
}
