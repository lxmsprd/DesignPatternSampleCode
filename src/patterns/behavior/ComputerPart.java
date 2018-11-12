package patterns.behavior;

public interface ComputerPart {
    void accept(ComputerPartVisitor cp);
}
