package patterns.behavior;

public class OrExpression implements Expression {
    private Expression mExpr1 = null;
    private Expression mExpr2 = null;

    public OrExpression(Expression expr1, Expression expr2) {
        this.mExpr1 = expr1;
        this.mExpr2 = expr2;
    }

    @Override
    public boolean interpret(String context) {
        return mExpr1.interpret(context) || mExpr2.interpret(context);
    }
}
