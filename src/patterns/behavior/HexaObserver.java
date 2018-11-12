package patterns.behavior;

public class HexaObserver extends Observer {
    protected Subject mSubject;

    public HexaObserver(Subject subject) {
        mSubject = subject;
        this.mSubject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa String: " + Integer.toHexString(mSubject.getState()));
    }

}
