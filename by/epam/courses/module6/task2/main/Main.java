package by.epam.courses.module6.task2.main;

//Задание 2. Блокнот. Разработать консольное приложение, работающее с Заметками
//в Блокноте. Каждая Заметка это: Заметка (тема, дата создания, e-mail, сообщение).
//Общие пояснения к практическому заданию.
//• В начале работы приложения данные должны считываться из файла, в конце
//работы – сохраняться в файл.
//• У пользователя должна быть возможность найти запись по любому параметру
//или по группе параметров (группу параметров можно определить
//самостоятельно), получить требуемые записи в отсортированном виде, найти
//записи, текстовое поле которой содержит определенное слово, а также
//добавить новую запись.
//• Особое условие: поиск, сравнение и валидацию вводимой информации
//осуществлять с использованием регулярных выражений.
//• Особое условие: проверку введенной информации на валидность должен
//осуществлять код, непосредственно добавляющий информацию.

import by.epam.courses.module6.task2.note.Note;
import by.epam.courses.module6.task2.notebook.Notebook;
import by.epam.courses.module6.task2.notebook.NotebookLogic;

public class Main {
    public static void main(String[] args) {
        Note note1 = new Note("Machine", "qwe@mail.ru", "2020-01-24", "Hello world");
        Note note2 = new Note("Airplane", "asd@yandex.com", "2020-02-17", "Good morning");
        Note note3 = new Note("River", "hjk@gmail.ru", "2020-01-04", "hi");
        Note note4 = new Note("Sky", "asd@yandex.com", "2020-03-10", "Start");
        Notebook notebook = new Notebook();
        NotebookLogic logic = new NotebookLogic(notebook);

        logic.addNotesFromFileToNotebook();
        logic.addNote(note3);
        logic.addNote(note2);
        logic.addNote(note1);
        logic.addNote(note4);

        System.out.println("Поиск заметки по теме");
        logic.findNotesByTopic("Machine");
        System.out.println();

        System.out.println("Поиск заметки по email");
        logic.findNotesByEmail("asd@yandex.com");
        System.out.println();

        System.out.println("Поиск заметки по дате");
        logic.findNotesByDate("2020-02-17");
        System.out.println();

        System.out.println("Поиск заметки которая содежрит определённое слово");
        logic.findNotesByWordInMessage("Hello");
        System.out.println();

        logic.writeNotesToFile();
    }
}
