package by.epam.courses.module6.task1.email.message;

import by.epam.courses.module6.task1.book.Book;

import java.util.Objects;

public class Message {
    private String text;
    private Book book;

    public Message(String text){
        this.text = text;
    }

    public Message(Book book){
        this.book = book;
    }

    public Message(String text, Book book) {
        this.text = text;
        this.book = book;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Message message = (Message) o;
        return Objects.equals(text, message.text) &&
                Objects.equals(book, message.book);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, book);
    }

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + '\'' +
                ", book=" + book +
                '}';
    }
}
