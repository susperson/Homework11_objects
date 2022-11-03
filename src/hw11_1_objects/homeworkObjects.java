package hw11_1_objects;

public class homeworkObjects {
    public static void main(String[] args) {
        Author joanneRowling = new Author("Joanne", "Rowling");
        Author jRRTolkien = new Author("John Ronald Reuel", "Tolkien");
        Author joanne2 = new Author("Joanne", "Rowling");
        Book harryPotter = new Book("Harry Potter and the Philosopher's Stone", joanneRowling, 1997);
        Book theLordOfTheRings = new Book("The Lord of the Rings", jRRTolkien, 1954);


        System.out.println(joanneRowling);
        System.out.println(jRRTolkien);
        System.out.println();
        System.out.println(harryPotter);
        System.out.println(theLordOfTheRings);
        System.out.println();
        System.out.println(joanneRowling.equals(joanne2));
        System.out.println(harryPotter.equals(theLordOfTheRings));
    }
}
