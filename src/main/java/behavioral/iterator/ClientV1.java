package behavioral.iterator;

public class ClientV1 {
    public static void main(String[] args) {

        BookCollectionV1 bookCollectionV1 = new BookCollectionV1();
        bookCollectionV1.addBook(new Book("Java"));
        bookCollectionV1.addBook(new Book("Python"));
        bookCollectionV1.addBook(new Book("c++"));

        for (int i = 0; i < bookCollectionV1.getBooks().size(); i++) {
            System.out.println(bookCollectionV1.getBooks().get(i));
        }

        // Now, if someone changed the logic to store the books in the BookCollectionV1
        // your client code would break.
        // The above code is tightly coupled with the list implementation.
        // Here comes the iterator design pattern

    }
}
