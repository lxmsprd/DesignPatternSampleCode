package patterns.behavior;

public class Memento {
    private String mState;

    public Memento(String state) {
        mState = state;
    }

    public String getState() {
        return mState;
    }
}
