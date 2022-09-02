package Chapter15.ProgrammingExercises3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class BookSortDemo4 {
    public static void main(String[] args) {
        Book b1 = new Book("9999999999", "Clowning Around", "Joe King");
        Book b2 = new Book("2222222222", "Travel With Me", "Sandy Beach");
        Book b3 = new Book("4444444444", "Interior Design", "Anita Room");
        Book b4 = new Book("3333333333","java In 2 Semester","Quentin Charatan");
        System.out.println(b1.compareTo(b4));
        List<Book> bookList = new ArrayList<>();
        bookList.add(b1);
        bookList.add(b2);
        bookList.add(b3);
        System.out.println("***COMPARATOR DEMO***");
        System.out.println("\nBefore Sort\n"+bookList);
        bookList.sort(Book::compareTo);
        System.out.println("\nAfter length of title sort wia comparing\n"+ bookList);
        bookList.sort(Comparator.naturalOrder());
        System.out.println("\nAfter length of title sort wia naturalOrder\n"+ bookList);

    }
}
