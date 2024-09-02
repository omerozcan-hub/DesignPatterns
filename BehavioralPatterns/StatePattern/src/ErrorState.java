public class ErrorState implements State {
    @Override
    public void handleRequest() {
        System.out.println("Printer is in an error state!");
    }
}