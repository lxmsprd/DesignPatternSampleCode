package patterns.structure;

public abstract class Shape {
    protected DrawAPI mDrawAPI;

    public Shape() {
    }

    public Shape(DrawAPI drawAPI) {
        this.mDrawAPI = drawAPI;
    }

    public abstract void draw();

}
