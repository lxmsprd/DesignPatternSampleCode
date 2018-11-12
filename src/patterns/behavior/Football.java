package patterns.behavior;

public class Football extends Game{

    @Override
    protected void initialize() {
        System.out.println("Football Game is initialized ! Start Playing.");
    }

    @Override
    protected void startPlay() {
        System.out.println("Football Game Started. Enjoy the game.");
    }

    @Override
    protected void endPlay() {
        System.out.println("Football Game Finished.");
    }
}
