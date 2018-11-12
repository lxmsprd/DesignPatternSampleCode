package patterns.creation;

public class FactoryProducer {
    public static AbstractFactory getFactory(String choice) {
        if (choice == null) return null;

        if (choice.equalsIgnoreCase(AbstractFactory.SHAPE_FACTORY)) {
            return new ShapeFactory();
        }

        if (choice.equalsIgnoreCase(AbstractFactory.COLOR_FACTORY)) {
            return new ColorFactory();
        }

        return null;
    }
}
