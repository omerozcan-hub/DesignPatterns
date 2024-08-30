public class Main {
    public static void main(String[] args) {

        Book originalBook = new Book("Design Patterns", "Erich Gamma");

        Book clonedBook = originalBook.clone();
        clonedBook.setTitle("Design Patterns (Updated)");

        System.out.println("Original Book: " + originalBook);
        System.out.println("Cloned Book: " + clonedBook);
    }
}
