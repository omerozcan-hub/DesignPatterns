public class Chess extends Game {

    @Override
    void initialize() {
        System.out.println("Chess Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Game Started. Welcome to Chess.");
    }

    @Override
    void endPlay() {
        System.out.println("Game Finished!");
    }
}