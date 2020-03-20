package by.epam.courses.module4.simple_classes.task6.main;

//6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
//изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
//недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
//заданное количество часов, минут и секунд.

import by.epam.courses.module4.simple_classes.task6.time.Time;
import by.epam.courses.module4.simple_classes.task6.time.TimeLogic;

public class Main {
    public static void main(String[] args) {
        Time time = new Time(6, 40, 30);
        TimeLogic tl = TimeLogic.getInstance();
        tl.printTime(time);

        tl.increaseHours(5, time);
        tl.printTime(time);

        tl.increaseMinutes(20, time);
        tl.printTime(time);

        tl.increaseSeconds(10, time);
        tl.printTime(time);

        tl.reduceHours(2, time);
        tl.printTime(time);

        tl.reduceMinutes(40, time);
        tl.printTime(time);

        tl.reduceSeconds(50, time);
        tl.printTime(time);
    }
}
