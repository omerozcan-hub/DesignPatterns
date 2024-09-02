public class Main {
    public static void main(String[] args) {
        BookList bookList = new BookList();
        bookList.addBook(new Book("The Catcher in the Rye", "J.D. Salinger"));
        bookList.addBook(new Book("To Kill a Mockingbird", "Harper Lee"));
        bookList.addBook(new Book("1984", "George Orwell"));

        BookIterator iterator = bookList.createIterator();

        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(book);
        }
    }
}