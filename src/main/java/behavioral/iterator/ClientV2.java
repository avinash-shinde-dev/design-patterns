package behavioral.iterator;

import java.util.Iterator;

public class ClientV2 {

    public static void main(String[] args) {
        System.out.println("Using iterator design pattern");
        BookCollectionV2 bookCollectionV2 = new BookCollectionV2();
        bookCollectionV2.addBook(new Book("Java"));
        bookCollectionV2.addBook(new Book("Python"));
        bookCollectionV2.addBook(new Book("c++"));

        // Now, if someone changed the logic to store the books in the BookCollectionV1
        // your client code would break.
        // The above code is tightly coupled with the list implementation.
        // Here comes the iterator design pattern

//        for (int i = 0; i < bookCollectionV2.getBooks().size(); i++) {
//            System.out.println(bookCollectionV2.getBooks().get(i));
//        }

        // Now, client doesn't need to change the logic
        // if ever the collection logic changed, that would be changed in that
        // specific class
        Iterator<Book> iterator = bookCollectionV2.createIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
