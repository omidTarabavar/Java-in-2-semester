package Chapter15;

public class TestHashCode {
    public static void main(String[] args) {
        Book b1 = new Book("999", "Clowning Around", "Joe King");
        Book b2 = new Book("999", "Clowning Around", "Joe King");
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
    }
}
