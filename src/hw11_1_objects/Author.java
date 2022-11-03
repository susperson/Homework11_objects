package hw11_1_objects;

import java.util.Objects;

public class Author {
    private final String firstName;
    private final String lastName;

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    @Override
    public String toString() {
        return "Автор: " + firstName + " " + lastName;
    }

    @Override
    public boolean equals(Object otherAuthor) {
        if (this == otherAuthor) return true;
        if (otherAuthor == null || getClass() != otherAuthor.getClass()) return false;
        Author author = (Author) otherAuthor;
        return Objects.equals(firstName, author.firstName) && Objects.equals(lastName, author.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName);
    }
}
