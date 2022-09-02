package Chapter15.ProgrammingExercises3;

import java.util.ArrayList;
import java.util.List;

public class BookSortDemo2 {
    public static void main(String[] args) {
        Book b1 = new Book("9999999999", "Clowning Around", "Joe King");
        Book b2 = new Book("2222222222", "Travel With Me", "Sandy Beach");
        Book b3 = new Book("4444444444", "Interior Design", "Anita Room");
        List<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        System.out.println("***COMPARATOR DEMO***");
        System.out.println("\nBefore Sort\n"+bookList);
        bookList.sort((book1,book2) -> {return book1.getAuthor().compareTo(book2.getAuthor());});
        System.out.println("\nAfter Author sort\n"+ bookList);

    }
}
