package behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BookCollectionV2 {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        this.books.add(book);
    }

    public List<Book> getBooks() {
        return this.books;
    }

    public BookIterator createIterator() {
        return new BookIterator(this.books);
    }
    private static class BookIterator implements Iterator<Book> {
        List<Book> books;
        int position;
        public BookIterator(List<Book> books) {
            this.books = books;
        }

        @Override
        public boolean hasNext() {
            return position < books.size();
        }

        @Override
        public Book next() {
            return books.get(position++);
        }
    }
}
