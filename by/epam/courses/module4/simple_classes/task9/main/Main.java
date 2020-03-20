package by.epam.courses.module4.simple_classes.task9.main;

//9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
//метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
//методами. Задать критерии выбора данных и вывести эти данные на консоль.
//Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
//Найти и вывести:
//a) список книг заданного автора;
//b) список книг, выпущенных заданным издательством;
//c) список книг, выпущенных после заданного года.

import by.epam.courses.module4.simple_classes.task9.bookArray.BookArrayLogic;
import by.epam.courses.module4.simple_classes.task9.book.Book;
import by.epam.courses.module4.simple_classes.task9.bookArray.BookArray;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Сияние", "Стивен Кинг",
                "АСТ", 2015);
        Book book2 = new Book("Чужак", "Стивен Кинг",
                "АСТ", 2019);
        Book book3 = new Book("Гарри Поттер и Тайная комната", "Джоан Роулинг",
                "Махаон", 2019);

        BookArray bookArray = new BookArray(book1, book2);
        BookArrayLogic arrLog = BookArrayLogic.getInstance();

        arrLog.addBook(book3, bookArray);

        System.out.println("ВЫВОД КНИГ ЗАДАННОГО АВТОРА:");
        arrLog.printBooksOfAuthor("Стивен Кинг", bookArray);

        System.out.println("ВЫВОД КНИГ ЗАДАННОГО ИЗДАТЕЛЬСТВА:");
        arrLog.printBooksOfPublishingHouse("Махаон", bookArray);

        System.out.println("ВЫВОД КНИГ ВЫШЕДШИХ ПОСЛЕ УКАЗАННОГО ГОДА:");
        arrLog.printBooksAfterYear(2017, bookArray);
    }
}
