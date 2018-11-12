package patterns.behavior;

public class RealCustomer extends AbstractCustomer {
    RealCustomer(String name) {
        mName = name;
    }

    @Override
    public String getName() {
        return mName;
    }

    @Override
    public boolean getNil() {
        return false;
    }
}
