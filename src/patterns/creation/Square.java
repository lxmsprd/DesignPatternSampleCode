package patterns.creation;

public class Square extends Shape {

    public Square() {
        type = Shape.TYPE_SQUARE;
    }

    @Override
    public void draw(){
        System.out.println("I am a " + Shape.TYPE_SQUARE);
    }
}
