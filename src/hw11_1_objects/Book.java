package hw11_1_objects;

import java.util.Objects;

public class Book {
    private final String name;
    private final Author author;
    private int publishingYear;

    public Book(String name, Author author, int publishingYear) {
        this.name = name;
        this.author = author;
        this.publishingYear = publishingYear;
    }

    public String getName() {
        return this.name;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Книга: " + name + ". " + author + ", год публикации: " + publishingYear;
    }

    @Override
    public boolean equals(Object otherBook) {
        if (this == otherBook) return true;
        if (otherBook == null || getClass() != otherBook.getClass()) return false;
        Book book = (Book) otherBook;
        return Objects.equals(name, book.name) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author);
    }
}
