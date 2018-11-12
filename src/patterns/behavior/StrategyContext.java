package patterns.behavior;

public class StrategyContext {
    private Strategy mStrategy;

    StrategyContext(Strategy strategy) {
        mStrategy = strategy;
    }

    public int executeStrategy(int num1, int num2) {
        return mStrategy.doOperation(num1, num2);
    }
}
