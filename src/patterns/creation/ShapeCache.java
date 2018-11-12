package patterns.creation;

import java.util.Hashtable;

// For create an object is costly(for example, create the object
// need database query or network access etc), we can cache the
// object and return the cached object while next create request
public class ShapeCache {
    private static Hashtable<String, Shape> shapeMap =
            new Hashtable<String, Shape>();

    public static Shape getShape(String id) {
        Shape cachedShape = shapeMap.get(id);
        return (Shape) cachedShape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);

        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);
    }
}
