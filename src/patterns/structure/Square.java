package patterns.structure;

public class Square extends Shape {
    private int x;
    private int y;
    private int length;
    private DrawAPI mDrawAPI;

    public Square(int x, int y, int length, DrawAPI drawAPI) {
        this.x = x;
        this.y = y;
        this.length = length;
        mDrawAPI = drawAPI;
    }
    @Override
    public void draw() {
        mDrawAPI.drawSquare(x, y, length);
    }

}
