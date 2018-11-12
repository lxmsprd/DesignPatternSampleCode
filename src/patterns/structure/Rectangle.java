package patterns.structure;

public class Rectangle extends Shape {
    int x;
    int y;
    int length;
    int width;

    public Rectangle(int x, int y, int length, int width, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        mDrawAPI.drawRectangle(x, y, length, width);
    }
}
