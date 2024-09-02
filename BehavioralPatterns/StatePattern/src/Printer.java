public class Printer {
    private State currentState;

    public Printer() {
        currentState = new ReadyState();  // Initial state
    }

    public void setState(State state) {
        currentState = state;
    }

    public void print() {
        currentState.handleRequest();
    }
}