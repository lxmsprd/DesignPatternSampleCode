package patterns.behavior;

public class Mouse implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor cp) {
        cp.visit(this);
    }
}
