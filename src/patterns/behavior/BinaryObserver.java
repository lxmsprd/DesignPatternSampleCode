package patterns.behavior;

public class BinaryObserver extends Observer {
    protected Subject mSubject;

    public BinaryObserver(Subject subject) {
        mSubject = subject;
        this.mSubject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(mSubject.getState()));
    }
}
