package Chapter15;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Library {
    private Map<String,Book> books;
    public Library(){
        books = new HashMap<>();
    }
    public boolean addBook(Book book){
        String key = book.getIsbn();
        if(books.containsKey(key)){
            return false;
        }else {
            books.put(key,book);
            return true;
        }
    }
    public boolean removeBook(String isbn){
        return books.remove(isbn) != null;
    }
    public int getTotalNumberOfBooks(){
        return books.size();
    }
    public Book getBook(String isbn){
        return books.get(isbn);
    }
    public Set<Book> getAllBooks(){
        Set<Book> bookSet = new HashSet<>();
        books.forEach((key,book) -> bookSet.add(book));
        return bookSet;
    }
    public static void main(String[] args) {

    }
}
