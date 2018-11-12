package patterns.behavior;

public class Originator {
    private String mState;

    public void setState(String state) {
        mState = state;
    }

    public String getState() {
        return mState;
    }

    public Memento saveStateToMemento() {
        return new Memento(mState);
    }

    public void setStateFromMemento(Memento memento) {
        mState =  memento.getState();
    }
}
