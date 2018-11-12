package patterns.creation;

public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String type) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        if (color == null) return null;

        if (color.equalsIgnoreCase(Color.RED)) {
            return new Red();
        }

        if (color.equalsIgnoreCase(Color.GREEN)) {
            return new Blue();
        }

        if (color.equalsIgnoreCase(Color.BLUE)) {
            return new Blue();
        }

        return null;
    }
}
