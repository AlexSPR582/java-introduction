package by.epam.courses.module4.aggregation_and_composition.task1.main;

/*1. Создать объект класса Текст, используя классы Предложение, Слово. Методы: дополнить текст,
 вывести на консоль текст, заголовок текста.*/

import by.epam.courses.module4.aggregation_and_composition.task1.sentence.Sentence;
import by.epam.courses.module4.aggregation_and_composition.task1.text.Text;
import by.epam.courses.module4.aggregation_and_composition.task1.text.TextLogic;
import by.epam.courses.module4.aggregation_and_composition.task1.word.Word;

public class Main {
    public static void main(String[] args) {
        Word title = new Word("Лес");
        Sentence sentence1 = new Sentence("Человек гулял по лесу.");
        Sentence sentence2 = new Sentence("На деревьях пели птицы.");
        Sentence sentence3 = new Sentence("Где-то далеко был слышен шум реки.");

        Text text = new Text(title, sentence1, sentence2, sentence3);
        TextLogic logic = TextLogic.getInstance();

        System.out.println("ЗАГОЛОВОК ТЕКСТА");
        logic.printTitle(text);

        System.out.println("ВЫВОД ТЕКСТА В КОНСОЛЬ");
        logic.printText(text);

        logic.addText(text, new Sentence("Вдруг рядом с ним упала шишка!"));

        System.out.println("ВЫВОД ТЕКСТА В КОНСОЛЬ ПОСЛЕ ДОБАВЛЕНИЯ ПРЕДЛОЖЕНИЯ");
        logic.printText(text);
    }
}
