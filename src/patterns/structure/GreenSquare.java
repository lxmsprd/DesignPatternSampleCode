package patterns.structure;

public class GreenSquare extends DrawAPI {
    @Override
    public void drawSquare(int x, int y, int length) {
        System.out.println("Drawing Green Square x:" + x + ", y:" + y + ", length:" + length);
    }

}
