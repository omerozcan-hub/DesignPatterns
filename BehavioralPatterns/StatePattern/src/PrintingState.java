public class PrintingState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Printer is currently printing...");
    }
}