package patterns.creation;

public class SingleObject {
    private static SingleObject sInstance;

    // make the constructor private to ensure that
    // this class can not be instantiate outside.
    private SingleObject() {
    }

    public static final SingleObject getInstance() {
        if (sInstance == null) {
            // Keep concurrent calling safety
            synchronized(SingleObject.class) {
                if (sInstance == null) {
                    sInstance = new SingleObject();
                }
            }
        }
        return sInstance;
    }

    public void showMessage(String who) {
        System.out.println("Hello, I am the Single Object:" + sInstance
                + ", call from " + who);
    }
}
