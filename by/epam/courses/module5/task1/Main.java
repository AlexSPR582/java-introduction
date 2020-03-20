package by.epam.courses.module5.task1;

//Задача 1.
//Создать объект класса Текстовый файл, используя классы Файл, Директория.
//Методы: создать, переименовать, вывести на консоль содержимое, дополнить, удалить.

import by.epam.courses.module5.task1.directory.Directory;
import by.epam.courses.module5.task1.textFile.TextFile;

public class Main {
    public static void main(String[] args) {
        Directory directory = new Directory("D:/project", "files");
        TextFile textFile1 = TextFile.create("first file", directory);

        textFile1.addText("Hello world");
        textFile1.printText();

        System.out.println(textFile1.getName());
        textFile1.rename("rename file");
        System.out.println(textFile1.getName());

        textFile1.delete();
        textFile1.printText();
    }
}
