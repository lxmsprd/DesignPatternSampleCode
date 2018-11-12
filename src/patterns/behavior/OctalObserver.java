package patterns.behavior;

public class OctalObserver extends Observer{
    protected Subject mSubject;

    public OctalObserver(Subject subject) {
        mSubject = subject;
        this.mSubject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: " + Integer.toOctalString(mSubject.getState()));
    }
}
