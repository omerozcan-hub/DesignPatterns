import java.util.Stack;

public class Caretaker {
    private final Stack<Memento> mementoStack = new Stack<>();

    public void addMemento(Memento memento) {
        mementoStack.push(memento);
    }

    public Memento getMemento() {
        return mementoStack.pop();
    }
}