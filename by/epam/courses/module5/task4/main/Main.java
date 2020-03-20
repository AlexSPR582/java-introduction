package by.epam.courses.module5.task4.main;

/*Создать консольное приложение, удовлетворяющее следующим требованиям:
• Приложение должно быть объектно-, а не процедурно-ориентированным.
• Каждый класс должен иметь отражающее смысл название и информативный состав.
• Наследование должно применяться только тогда, когда это имеет смысл.
• При кодировании должны быть использованы соглашения об оформлении кода java code convention.
• Классы должны быть грамотно разложены по пакетам.
• Консольное меню должно быть минимальным.
• Для хранения данных можно использовать файлы.

Дракон и его сокровища. Создать программу, позволяющую обрабатывать сведения о 100 сокровищах в пещере
дракона.  Реализовать  возможность  просмотра  сокровищ,  выбора  самого  дорогого  по  стоимости  сокровища  и
выбора сокровищ на заданную сумму. */

import by.epam.courses.module5.task4.cave.DragonCave;
import by.epam.courses.module5.task4.cave.DragonCaveLogic;
import by.epam.courses.module5.task4.treasure.Treasure;
import by.epam.courses.module5.task4.treasure.TreasureLogic;

public class Main {
    public static void main(String[] args) {
        DragonCave cave = new DragonCave();
        DragonCaveLogic caveLogic = DragonCaveLogic.getInstance();

        System.out.println("ПРОСМОТР ВСЕХ СОКРОВИЩ (ОТРОРТИРОВАННЫХ):");
        caveLogic.readTreasuresFromFile(cave);
        caveLogic.sortPrice(cave);
        caveLogic.printTreasures(cave);

        System.out.println("CАМОЕ ДОРОГОЕ СОКРОВИЩЕ:");
        TreasureLogic.getInstance().printTreasure(caveLogic.findMostExpensiveTreasure(cave));

        caveLogic.addTreasure(new Treasure("Алмаз", 2500), cave);

        System.out.println("СОКРОВИЩА НА ЗАДАННУЮ СУММУ:");
        caveLogic.printTreasures(caveLogic.findTreasuresForPrice(2500, cave));

        caveLogic.writeTreasuresToFile(cave);
    }
}
