package hw11_1_objects;

public class homeworkObjects {
    public static void main(String[] args) {
        Author joanneRowling = new Author("Joanne", "Rowling");
        Author jRRTolkien = new Author("John Ronald Reuel", "Tolkien");
        Book harryPotter = new Book("Harry Potter and the Philosopher's Stone", joanneRowling, 1997);
        Book theLordOfTheRings = new Book("The Lord of the Rings", jRRTolkien, 1954);


        joanneRowling.printAuthor();
        jRRTolkien.printAuthor();
        System.out.println();
        harryPotter.printBookInfo();
        theLordOfTheRings.printBookInfo();

        theLordOfTheRings.setPublishingYear(1960);
        theLordOfTheRings.printBookInfo();
    }




}
