package by.epam.courses.module6.task1.main;

import by.epam.courses.module6.task1.users.user.User;
import by.epam.courses.module6.task1.book.Book;
import by.epam.courses.module6.task1.users.admin.AdminLogic;
import by.epam.courses.module6.task1.users.user.UserLogic;

//Задание 1: создать консольное приложение “Учет книг в домашней библиотеке”.
//Общие требования к заданию:
//• Система учитывает книги как в электронном, так и в бумажном варианте.
//• Существующие роли: пользователь, администратор.
//• Пользователь может просматривать книги в каталоге книг, осуществлять поиск
//книг в каталоге.
//• Администратор может модифицировать каталог.
//• *При добавлении описания книги в каталог оповещение о ней рассылается на
//e-mail всем пользователям
//• **При просмотре каталога желательно реализовать постраничный просмотр
//• ***Пользователь может предложить добавить книгу в библиотеку, переслав её
//администратору на e-mail.
//• Каталог книг хранится в текстовом файле.
//• Данные аутентификации пользователей хранятся в текстовом файле. Пароль
//не хранится в открытом виде.

public class Main {
    public static void main(String[] args) {
        User Ivan = User.getInstance("123", "456332");
        User Sasha = User.getInstance("565" , "3243465");
        User Maks = User.getInstance("876", "2354365");

        UserLogic ul = new UserLogic();

        ul.addUser(Ivan);
        ul.addUser(Sasha);
        ul.addUser(Maks);

        System.out.println();
        ul.singIn(Ivan);
        ul.singIn(Sasha);
        ul.singIn(Maks);

        Book book1 = new Book("Преступление и наказание", "Фёдор Достоевский", 1886);
        Book book2 = new Book("Война и мир", "Лев Толстой", 1869);
        Book book3 = new Book("Мёртвые души", "Гоголь", 1896);

        AdminLogic al = new AdminLogic();
        al.addBook(book1, true, true);
        al.addBook(book2, true, false);
        al.addBook(book3, false, false);

        ul.checkEmail(Ivan);

        System.out.println('\n' + "Просмотр пользователем списка книг");
        ul.viewAllBooks(Sasha);

        System.out.println('\n' + "Пользователь ищет книгу в каталоге");
        ul.findBook(Ivan, "Война и мир");

        System.out.println('\n' + "Пользователь предлагает добавить книгу отправив администратору на email");
        Book book4 = new Book("Колобок", "Алекс", 2002);
        ul.sendRecommendation(Ivan, book4);

        System.out.println('\n' + "рекомендованная книга появилась у администратора на почте");
        al.checkEmail();

        ul.viewAllBooks(Ivan);
    }
}
