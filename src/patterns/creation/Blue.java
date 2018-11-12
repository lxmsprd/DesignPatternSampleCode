package patterns.creation;

public class Blue implements Color{
    @Override
    public void fill() {
        System.out.println("Fill the Shape with " + Color.BLUE);;
    }

}
