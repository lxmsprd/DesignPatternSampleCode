package patterns.structure;

public class RedRectangle extends DrawAPI {
    @Override
    public void drawRectangle(int x, int y, int length, int width) {
        System.out.println("Drawing Red Rectangle x:" + x + ", y:" + y + ", length:"
                + length + ", width:"+ width);
    }
}
