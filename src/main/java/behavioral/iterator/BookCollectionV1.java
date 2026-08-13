package behavioral.iterator;

import java.util.ArrayList;
import java.util.List;

public class BookCollectionV1 {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        this.books.add(book);
    }

    public List<Book> getBooks() {
        return this.books;
    }
}
