package patterns.behavior;

public abstract class Game {
    protected abstract void initialize();
    protected abstract void startPlay();
    protected abstract void endPlay();

    // Template Method
    protected final void play() {
        // Initialize the game
        initialize();

        // Play game
        startPlay();

        // End game
        endPlay();
    }
}
