package by.epam.courses.module4.simple_classes.task9.bookArray;

import by.epam.courses.module4.simple_classes.task9.book.Book;

public class BookArray {
    private Book[] books;

    public BookArray(Book... books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }
}
