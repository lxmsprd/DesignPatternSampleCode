package patterns.structure;

public class GreenCircle extends DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing green circle: radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
