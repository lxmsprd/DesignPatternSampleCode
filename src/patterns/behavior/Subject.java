package patterns.behavior;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observer> mObservers = new ArrayList<Observer>();
    private int mState;

    public int getState() {
        return mState;
    }

    public void setState(int state) {
        mState = state;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        mObservers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer: mObservers) {
            observer.update();
        }
    }
}
