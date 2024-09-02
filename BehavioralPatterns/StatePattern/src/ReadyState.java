public class ReadyState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Printer is ready to print.");
    }
}