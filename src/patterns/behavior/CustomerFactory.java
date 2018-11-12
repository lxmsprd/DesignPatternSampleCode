package patterns.behavior;

public class CustomerFactory {
    public static final String[] mNames = {"Anna", "Michael", "Jhon"};

    public static AbstractCustomer getCustomer(String name) {
        for (int i = 0; i < mNames.length; i++) {
            if (mNames[i].equalsIgnoreCase(name)) {
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
