package hw11_1_objects;

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

    public void printBookInfo() {
        System.out.println("************");
        System.out.println("Книга: " + this.getName());
        System.out.print("Автор: ");
        this.getAuthor().printAuthor();
        System.out.println("Год издания: " + this.getPublishingYear());
    }

}
