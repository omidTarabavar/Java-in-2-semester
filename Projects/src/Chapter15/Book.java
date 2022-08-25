package Chapter15;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Book {
    private String isbn;
    private String title;
    private String author;

    public Book(String isbn,String title,String author){
        this.isbn = isbn;
        this.author = author;
        this.title = title;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();
        Book b1 = new Book("9999999999", "Clowning Around", "Joe King");
        Book b2 = new Book("2222222222", "Travel With Me", "Sandy Beach");
        books.add(b1);
        books.add(b2);
        System.out.println(books);
        System.out.println(books.contains(new Book("2222222222", "Travel With Me", "Sandy Beach")));
    }

    @Override
    public String toString() {
        return "("+isbn+", "+title+", "+author+")";
    }

    @Override
    public boolean equals(Object obj) {
        Book bookIn = (Book) obj;
        return isbn.equals(bookIn.isbn);
    }

    @Override
    public int hashCode() {
        return isbn.hashCode();
    }
}
