import java.util.ArrayList;
import java.util.List;

public class BookList implements BookCollection {
    private List<Book> books;

    public BookList() {
        books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    @Override
    public BookIterator createIterator() {
        return new BookListIterator(books);
    }
}