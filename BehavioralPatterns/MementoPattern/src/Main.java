public class Main {
    public static void main(String[] args) {
        Originator originator = new Originator();
        Caretaker caretaker = new Caretaker();

        originator.setState("State #1");
        originator.setState("State #2");
        caretaker.addMemento(originator.saveToMemento());

        originator.setState("State #3");
        System.out.println("Current State: " + originator.getState());

        originator.restoreFromMemento(caretaker.getMemento());
        System.out.println("Restored State: " + originator.getState());
    }
}