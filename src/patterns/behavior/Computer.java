package patterns.behavior;

public class Computer implements ComputerPart {
    private ComputerPart[] parts;

    Computer() {
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    @Override
    public void accept(ComputerPartVisitor cp) {
        for (int i = 0; i < parts.length; i++) {
            parts[i].accept(cp);
        }
        cp.visit(this);
    }
}
