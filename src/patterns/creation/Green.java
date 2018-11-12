package patterns.creation;

public class Green implements Color{
    @Override
    public void fill() {
        System.out.println("Fill the Shape with " + Color.GREEN);
    }
}
