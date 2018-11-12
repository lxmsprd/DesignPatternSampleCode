package patterns.structure;

public class ShapeMaker {
    private Shape circle;
    private Shape rectangle;
    private Shape square;

    public ShapeMaker() {
        circle = new Circle(0, 0, 10, new RedCircle());
        rectangle = new Rectangle(0, 0, 10, 5, new RedRectangle());
        square = new Square(0, 0, 10, new GreenSquare());
    }

    public void drawCircle() {
        circle.draw();
    }

    public void drawRectangle() {
        rectangle.draw();
    }

    public void drawSquare() {
        square.draw();
    }
}
