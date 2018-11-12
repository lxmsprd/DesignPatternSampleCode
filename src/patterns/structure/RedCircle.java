package patterns.structure;

public class RedCircle extends DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing red circle: radius:" + radius + ", x:" + x + ", y:" + y);
    }
}
