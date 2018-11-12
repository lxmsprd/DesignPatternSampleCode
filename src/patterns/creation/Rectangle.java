package patterns.creation;

public class Rectangle extends Shape {

    public Rectangle() {
        type = Shape.TYPE_RECTANGLE;
    }

    @Override
    public void draw() {
        System.out.println("I am a " + Shape.TYPE_RECTANGLE);
    }

}
