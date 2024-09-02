
import java.util.List;

public class BookListIterator implements BookIterator {
    private List<Book> books;
    private int currentIndex;

    public BookListIterator(List<Book> books) {
        this.books = books;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        return currentIndex < books.size();
    }

    @Override
    public Book next() {
        return books.get(currentIndex++);
    }
}