public abstract class Game {
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    // Template method
    public final void play() {
        initialize();   // Initialize the game
        startPlay();    // Start game
        endPlay();      // End game
    }
}