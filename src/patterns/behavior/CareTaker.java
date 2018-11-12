package patterns.behavior;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mMementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mMementoList.add(state);
    }

    public Memento get(int index) {
        return mMementoList.get(index);
    }
}
