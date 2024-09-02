public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer();

        printer.print();

        printer.setState(new PrintingState());
        printer.print();

        printer.setState(new ErrorState());
        printer.print();
    }
}