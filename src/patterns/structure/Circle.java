package patterns.structure;

public class Circle extends Shape {
    private int radius;
    private int x;
    private int y;
    private String color = "";

    public Circle(int radius, int x, int y, DrawAPI drawAPI) {
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    public Circle(String color) {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        mDrawAPI.drawCircle(radius, x, y);
    }

    @Override
    public String toString() {
        return "Circle[" + this.hashCode() + "] x:"+ x + ", y:" + y + ", radius:"
                + radius + ", color:" + color;
    }
}
