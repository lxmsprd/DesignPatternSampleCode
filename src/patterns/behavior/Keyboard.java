package patterns.behavior;

public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor cp) {
        cp.visit(this);
    }
}
