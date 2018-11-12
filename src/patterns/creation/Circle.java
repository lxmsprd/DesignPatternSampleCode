package patterns.creation;

public class Circle extends Shape {

    public Circle() {
        type = Shape.TYPE_CIRCLE;
    }

    @Override
    public void draw() {
        System.out.println("I am a " + Shape.TYPE_CIRCLE);
    }
}
