package Chapter15;

public class LibraryTester {
    public static void main(String[] args) {
        Library myLib = new Library();
        Book book1 = new Book("001","Java","Omid");
        Book book2 = new Book("001","Java","Omid");
        Book book3 = new Book("002","C#","Mohammad");
        System.out.println(myLib.addBook(book1)? "book1 added":"couldn't add book1");
        System.out.println(myLib.addBook(book2)? "book2 added":"couldn't add book2");
        System.out.println(myLib.addBook(book3)? "book3 added":"couldn't add book3");
        System.out.println();
        System.out.println("All books: "+myLib.getAllBooks());
        System.out.println("Total number of books: "+myLib.getTotalNumberOfBooks());
        System.out.println(myLib.removeBook(book3.getIsbn())?"book3 removed":"couldn't remove book3");
        System.out.println("Total number of books after removing book3: "+myLib.getTotalNumberOfBooks());
        System.out.println(myLib.getBook(book1.getIsbn()) != null ? "book1: "+book1:"couldn't find book1");
        System.out.println(myLib.getBook(book3.getIsbn()) != null ? "book3: "+book3:"couldn't find book3");

    }
}
