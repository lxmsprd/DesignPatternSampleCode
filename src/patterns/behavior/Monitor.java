package patterns.behavior;

public class Monitor implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor cp) {
        cp.visit(this);
    }
}
