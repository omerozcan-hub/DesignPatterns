public class Soccer extends Game {

    @Override
    void initialize() {
        System.out.println("Soccer Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Game Started. Welcome to Soccer.");
    }

    @Override
    void endPlay() {
        System.out.println("Game Finished!");
    }
}