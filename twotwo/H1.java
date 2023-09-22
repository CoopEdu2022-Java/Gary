package twotwo;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return title + " by " + author;
    }
}

class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}

public class H1 {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("Pride and Prejudice", "Jane Austen");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);

        System.out.println("Library books: " + library.getBooks());

        library.removeBook(book2);

        System.out.println("Updated library books: " + library.getBooks());
    }
}

