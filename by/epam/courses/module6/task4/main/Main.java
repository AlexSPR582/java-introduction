package by.epam.courses.module6.task4.main;

//Задание 4. Многопоточность. Порт . Корабли заходят в порт для
//разгрузки/загрузки контейнеров. Число контейнеров, находящихся в текущий момент
//в порту и на корабле, должно быть неотрицательным и превышающим заданную
//грузоподъемность судна и вместимость порта. В порту работает несколько причалов.
//У одного причала может стоять один корабль. Корабль может загружаться у причала
//или разгружаться.

import by.epam.courses.module6.task4.ship.Ship;
import by.epam.courses.module6.task4.ship.ShipLogic;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Ship ship1 = new Ship("1");
        Ship ship2 = new Ship("2");
        Ship ship3 = new Ship("3");

        ShipLogic sL1 = new ShipLogic();

        sL1.uploading(ship1);
        Thread.sleep(3000);
        sL1.loading(ship3);
        sL1.loading(ship2);
    }
}
