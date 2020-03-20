package by.epam.courses.module4.simple_classes.task9.book;

import java.util.Objects;

public class Book {
    private int id;
    private String name;
    private String authors;
    private String publishingHouse;
    private int publishingYear;
    private int pagesNumber;
    private int price;
    private String bindingType;

    public Book(int id, String name, String authors, String publishingHouse,
                int publishingYear, int pagesNumber, int price, String bindingType) {
        this.id = id;
        this.name = name;
        this.authors = authors;
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
        this.pagesNumber = pagesNumber;
        this.price = price;
        this.bindingType = bindingType;
    }

    public Book(String name, String authors, String publishingHouse, int publishingYear) {
        this.name = name;
        this.authors = authors;
        this.publishingHouse = publishingHouse;
        this.publishingYear = publishingYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthors() {
        return authors;
    }

    public void setAuthors(String authors) {
        this.authors = authors;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBindingType() {
        return bindingType;
    }

    public void setBindingType(String bindingType) {
        this.bindingType = bindingType;
    }

    @Override
    public String toString() {
        return "epam.courses.module4.simpleClasse.task9.book.Book{" +
                "id=" + id +
                ", title='" + name + '\'' +
                ", authors='" + authors + '\'' +
                ", publishingHouse='" + publishingHouse + '\'' +
                ", publishingYear=" + publishingYear +
                ", pagesNumber=" + pagesNumber +
                ", price=" + price +
                ", bindingType='" + bindingType + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return id == book.id &&
                publishingYear == book.publishingYear &&
                pagesNumber == book.pagesNumber &&
                price == book.price &&
                Objects.equals(name, book.name) &&
                Objects.equals(authors, book.authors) &&
                Objects.equals(publishingHouse, book.publishingHouse) &&
                Objects.equals(bindingType, book.bindingType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, authors, publishingHouse,
                publishingYear, pagesNumber, price, bindingType);
    }
}
