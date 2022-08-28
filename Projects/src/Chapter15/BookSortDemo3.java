package Chapter15;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookSortDemo3 {
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

        bookList.sort(Comparator.naturalOrder());
        System.out.println("\nAfter ISBN sort\n"+ bookList);

        bookList.sort(Comparator.comparing(Book::getAuthor));
        System.out.println("\nAfter Author sort\n"+ bookList);

        bookList.sort(Comparator.comparing(Book::getTitle));
        System.out.println("\nAfter Title sort\n"+ bookList);
    }
}
