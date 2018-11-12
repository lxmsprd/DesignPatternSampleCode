package patterns.creation;

public abstract class AbstractFactory {
    public static final String SHAPE_FACTORY = "Shape";
    public static final String COLOR_FACTORY = "Color";

    abstract Shape getShape(String type);
    abstract Color getColor(String color);
}
