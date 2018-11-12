package patterns.creation;

public class ShapeFactory extends AbstractFactory{
    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String type) {
        if (type == null) {
            return null;
        }

        if (type.equalsIgnoreCase(Shape.TYPE_CIRCLE)) {
            return new Circle();
        }
        if (type.equalsIgnoreCase(Shape.TYPE_SQUARE)) {
            return new Square();
        }
        if (type.equalsIgnoreCase(Shape.TYPE_RECTANGLE)) {
            return new Rectangle();
        }
        return null;
    }
}
